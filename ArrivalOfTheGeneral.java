import java.util.Arrays;
import java.util.Scanner;


public class ArrivalOfTheGeneral {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] lineup = new int[n];
		int temp=0;
		int max=0, min=100, high=0, low=0;
		for (int i = 0; i < n; i++) {
			temp=in.nextInt();
			if(temp>max) {
				max=temp;
				high=i+1;
			}
			if(temp<=min){
				min=temp;
				low=i+1;
			}
		}
		if(high>low) System.out.println((high-1)+(n-low)-1);
		else System.out.println((high-1)+(n-low)); 
	}

}
