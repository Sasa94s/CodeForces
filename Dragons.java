import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Dragons {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		boolean status = false;
		int[] f = new int[n];
		int[] b = new int[n];
		int min=10000;
		for (int i = 0; i < n; i++) {
			f[i]=in.nextInt();
			b[i]=in.nextInt();
			if(min>f[i]) min=f[i];
		}
		if(s<min) {
			System.out.println("NO");
			return;
		}
		int end = 0;
		for (int i = 0; i < n; i++) {
			if(f[i]<s && f[i]!=-1) {
				s+=b[i];
				f[i]=-1;
				status=true;
				i=-1;
			} else if(f[i]==-1) continue; 
			else {
				status=false;
				continue;
			}
		}
		if(status==true) System.out.println("YES");
		else System.out.println("NO");
		
	}

}
