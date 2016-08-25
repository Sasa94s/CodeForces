import java.util.Arrays;
import java.util.Scanner;


public class Twins {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] coins = new int[n];
		int totalCoins = 0;
		for (int i = 0; i < n; i++) {
			coins[i]=in.nextInt();
			totalCoins+=coins[i];
		}
		int you=0, twin=totalCoins;
		Arrays.sort(coins);
		for (int i = n-1; i >= 0; i--) {
			//System.out.println(you + " " + twin);

			you+=coins[i];
			twin-=coins[i];
			if(you>twin){
				//System.out.println(you + " " + twin);
				System.out.println(n-i);
				break;
			}
		}
		
		
	}
	

}
