import java.util.Scanner;

public class Bitplusplus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = 0;
		in.nextLine();
		String temp;
		for (int i = 0; i < n; i++) {
			temp=in.nextLine();
			if(temp.charAt(0)=='+' || temp.charAt(temp.length()-1)=='+') x++;
			else if(temp.charAt(0)=='-' || temp.charAt(temp.length()-1)=='-') x--;
		}
		System.out.println(x);
	}

}
