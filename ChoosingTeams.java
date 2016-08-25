import java.util.Scanner;

public class ChoosingTeams {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int x, c=0 ;
		for (int i = 0; i < n; i++) {
			x=in.nextInt();
			if(5-x>=k) c++; 
		}
		x=0;
		while(true){
			if(c>=3) {
				c-=3;
				x++;
			} else break;
		}
		System.out.println(x);
	}
	

}
