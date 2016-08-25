import java.util.Scanner;

import javax.swing.JOptionPane;

public class WatchingAMovie {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = in.nextInt();
		int a=0, b=0, t=1, w=0;
		OUT:for (int i = 0; i < n; i++) {
			a=in.nextInt();
			b=in.nextInt();
			while(true){
				if(a>=t+s){
					t+=s;
					//System.out.println("1IM ALIVE at t="+t+" w="+w+" i="+i+" a="+a+" b="+b);
				} else {
					w+=b-t+1;
					t=b+1;
					//System.out.println("2IM ALIVE at t="+t+" w="+w+" i="+i+" a="+a+" b="+b);
					continue OUT;
				}
			}
		}
		System.out.println(w);
		
		

	}

}
