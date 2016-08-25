import java.util.Scanner;

public class GregsWorkout {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=0, b=1, c=2, nA=0, nB=0, nC=0;
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			if(i==a) {
				nA+=in.nextInt();
				a+=3;
			} else if(i==b) {
				nB+=in.nextInt();
				b+=3;
			} else if(i==c) {
				nC+=in.nextInt();
				c+=3;
			}
		}
		int max=0, x=0;
		if(nA>nB) {
			max=nA;
			x=10;
		}
		else {
			max=nB;
			x=20;
		}
		if(max<nC){
			max=nC;
			x=30;
		}
		if(x==10) System.out.println("chest");
		else if(x==20) System.out.println("biceps");
		else if(x==30) System.out.println("back");
		
	}

}
