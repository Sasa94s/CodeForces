import java.util.Scanner;


public class AWayTooLongWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String word = in.next();
			if(word.length()>10) {
				System.out.print(word.charAt(0));
				System.out.print(word.length()-2);
				System.out.print(word.charAt(word.length()-1));
				System.out.println();
			} else System.out.println(word);
		}
	}

}
