import java.util.Scanner;

public class RomaAndLuckyNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int c=0, l=0;
		String a;
		for (int i = 0; i < n; i++) {
			a=in.next();
			for (int j = 0; j < a.length(); j++) {
				if(a.charAt(j)=='4' || a.charAt(j)=='7') c++;
			}
			if(c<=k) l++;
			c=0;
		}
		System.out.println(l);
	}

}
