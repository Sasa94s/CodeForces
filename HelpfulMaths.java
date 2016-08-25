import java.util.Scanner;


public class HelpfulMaths {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		int n1=0, n2=0, n3=0;
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)=='1') n1++;
			else if(input.charAt(i)=='2') n2++;
			else if(input.charAt(i)=='3') n3++;
			//System.out.println("IM ALIVE:"+n1+","+n2+","+n3);
		}
		int i=0;
		for (; i < n1; i++) {
			if(i==n1+n2+n3-1) {
				System.out.print("1");
				break;
			}
			System.out.print("1+");
		}
		for (i=n1; i < n1+n2; i++) {
			if(i==n1+n2+n3-1) {
				System.out.print("2");
				break;
			}
			System.out.print("2+");
		}
		for (i=n1+n2; i < n1+n2+n3; i++) {
			if(i==n1+n2+n3-1) {
				System.out.print("3");
				break;
			}
			System.out.print("3+");
		}
	}

}
