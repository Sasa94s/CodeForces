import java.util.Scanner;


public class PetyaAndStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String first = in.next().toLowerCase();
		String second = in.next().toLowerCase();
		
		if(first.compareTo(second)==0) System.out.println(0);
		else if(first.compareTo(second)>0) System.out.println(1);
		else if(first.compareTo(second)<0) System.out.println(-1);
	}

}
