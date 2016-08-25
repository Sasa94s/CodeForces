import java.util.Scanner;


public class BeatufilMatrix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x=0, y=0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int temp = in.nextInt();
				if(temp==1) {
					x=i+1;
					y=j+1;
				}
			}
		}
		x=Math.abs(3-x);
		y=Math.abs(3-y);
		System.out.println(x+y);
	}

}
