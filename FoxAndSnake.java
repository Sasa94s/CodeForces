import java.util.Scanner;

public class FoxAndSnake {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int x=1, y=3;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(i%2==0) {
//					System.out.println("EVEN");
					System.out.print("#");
				}
				else if(i%2!=0) {
//					System.out.println("ODD");
					if(i==x && j==n-1) {
						System.out.print("#");
						x+=4;
					}
					else if(i==y && j==0){
						System.out.print("#");
						y+=4;
					}
					else System.out.print(".");
				}
			}
			System.out.println();
		}
	}

}
