import java.util.Scanner;


public class Presents {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] f = new int[n];
		for (int i = 0; i < n; i++) {
			f[i]=in.nextInt();
		}
		int j =1;
		for (int i = 0; i < n; i++) {
			if(f[i]==j){
				System.out.print((i+1)+" ");
				j++;
				i=-1;
				continue;
			}
		}
		
	}

}
