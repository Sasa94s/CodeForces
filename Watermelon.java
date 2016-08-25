import java.util.Scanner;


public class Watermelon {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		w=w-2;
		if(w%2==0 && w!=0) System.out.println("YES");
		else System.out.println("NO");
	}

}
