import java.util.Scanner;

public class PlayingWithDice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		int R = in.nextInt();
		int nL=0, nR=0, nD=0;
		for (int i = 1; i <= 6; i++) {
			if(Math.abs(L-i)<Math.abs(R-i)) nL++;
			else if(Math.abs(R-i)<Math.abs(L-i)) nR++;
			else nD++;
		}
		System.out.println(nL+" "+nD+" "+nR);
	}

}
