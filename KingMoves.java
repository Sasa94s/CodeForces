import java.util.Scanner;

public class KingMoves {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String pos = in.next();
		char xn[] = {'a','b','c','d','e','f','g','h'};
		char yn[] = {'8','7','6','5','4','3','2','1'};
		char x = pos.charAt(0);
		char y = pos.charAt(1);
		boolean prob1 = (x=='a' && y=='8') || (x=='a' && y=='1') || (x=='h' && y=='8') || (x=='h' && y=='1');
		boolean prob2 = (x=='h' || x=='a') || (y=='1' || y=='8');
		if(prob1) System.out.println(3);
		else if(prob2) System.out.println(5);
		else System.out.println(8);
		
	}

}
