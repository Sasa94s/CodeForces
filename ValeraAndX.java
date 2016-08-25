import java.util.Arrays;
import java.util.Scanner;

public class ValeraAndX {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int a=0, b=n-1;
//		char[][] c = new char[n][n];
//		in.nextLine();
//		for (int i = 0; i < n; i++) {
//			String temp = in.nextLine();
//			for (int j = 0; j < n; j++) {
//				c[i][j]=temp.charAt(j);
//			}
//		}
//		for (int i = 0; i < c.length; i++) {
//			System.out.println(Arrays.toString(c[i]));
//		}
//		char x=c[0][0], y=c[0][1];
//		System.out.println(x+" "+y);
//		for (int i = 0; i <= n/2; i++) {
//			for (int j = 0; j < n; j++) {
//				if(j==a && i==a) {
//					if(c[i][j]!=x) {
//						System.out.println("NO1"+i+j);
//						return;
//					} else {
//						a++;
//						continue;
//					}
//				} else if(j==b) { 
//					if(c[i][j]!=x) {
//						System.out.println("NO2");
//						return;
//					} else {
//						b--;
//						continue;
//					}
//				} else {
//					if(c[i][j]!=y) {
//						System.out.println("NO3");
//						return;
//					}
//				}
//			}
//		}
//		a=n/2-1; b=n-n/2;
//		for (int i = n/2+1; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				if(j==a){
//					if(c[i][j]!=x) {
//						System.out.println("NO4");
//						return;
//					} else {
//						a--;
//						continue;
//					}
//				}else if(j==b){ 
//					if(c[i][j]!=x) {
//						System.out.println("NO5"+i+j+a+b);
//						return;
//					} else {
//						b++;
//						continue;
//					}
//				}else{
//					if(c[i][j]!=y) {
//						System.out.println("NO6"+i+j+a+b);
//						return;
//					}
//				}
//			}
//		}
//		System.out.println("YES");
		
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String line;
		char[][] c = new char[n][n];
		for (int i = 0; i < n; i++) {
			line=in.nextLine();
			for (int j = 0; j < n; j++) {
				c[i][j]=line.charAt(j);
			}
		}
		boolean ok=true, flag2=true, flag3=true;
		char a=c[0][0], b=c[0][1];
		if(a==b) {
			System.out.println("NO");
			return;
		}
		int x=0, y=n-1;
		for (int i = 0; i < n; i++) {
			flag2=true;
			flag3=true;
			for (int j = 0; j < n; j++) {
				if(ok==false) {
					System.out.println("NO");
					return;
				}
				else {
					if(Math.abs(x)==Math.abs(y) && i==Math.abs(x) && j==Math.abs(x)){
//						System.out.println("IM ALIVE at 1 where ok is "+ok+" and x="+x+", y="+y+", i="+i+" , j="+j);
						x*=-1; x++;
						y*=-1; y--;
						if(c[i][j]==a) ok=true;
						else ok=false;
						flag2=false;
						flag3=false;
					} else if(j==Math.abs(x) && flag2==true){
						if(c[i][j]==a) ok=true;
						else ok=false;
//						System.out.println("IM ALIVE at 2 where ok is "+ok+" and x="+x+", y="+y+", i="+i+" , j="+j);
						x++;
						flag2=false;
					} else if(j==Math.abs(y) && flag3==true){
						if(c[i][j]==a) ok=true;
						else ok=false;
//						System.out.println("IM ALIVE at 3 where ok is "+ok+" and x="+x+", y="+y+", i="+i+" , j="+j);
						y--;
						flag3=false;
					} else {
						if(c[i][j]==b) ok=true;
						else ok=false;
//						System.out.println("IM ALIVE at 4 where ok is "+ok+" and x="+x+", y="+y+", i="+i+" , j="+j);
					}
				}
			}
		}
		if(ok==false) System.out.println("NO");
		else System.out.println("YES");
	}

}
