import java.util.Arrays;
import java.util.Scanner;

public class ValeraAndAntiqueItems {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int v = in.nextInt();
		int s[] = new int[n];
		int k, temp[], item, c=0;
		boolean ok = false;
		for (int i = 0; i < n; i++) {
			ok=true;
			k = in.nextInt();
			for (int j = 0; j < k; j++) {
				item=in.nextInt();
				if(v>item && ok==true){
					s[c]=i+1;
					ok=false;
					c++;
				}
			}
		}
		c=0;
		for (int j = 0; j < s.length; j++) {
			if(s[j]!=0) c++;
		}
		System.out.println(c);
		Arrays.sort(s);
		for (int j = 0; j < s.length; j++) {
			if(s[j]!=0) System.out.print(s[j]+" ");
		}
	}

}
