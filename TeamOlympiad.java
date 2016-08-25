import java.util.Scanner;

public class TeamOlympiad {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s[] = new int[n];
		int x=0, y=0, z=0;
		for (int i = 0; i < n; i++) {
			s[i]=in.nextInt();
			if(s[i]==1) x++;
			else if(s[i]==2) y++;
			else if(s[i]==3) z++;
		}
		if(x==0 || y==0 || z==0) {
			System.out.println(0);
			return;
		}
		int xn[]=new int[x], yn[]=new int[y], zn[]=new int[z];
		int cx=0, cy=0, cz=0;
		for (int i = 0; i < n; i++) {
			if(s[i]==1) {
				xn[cx]=i+1;
				cx++;
			}
			else if(s[i]==2){
				yn[cy]=i+1;
				cy++;
			}
			else if(s[i]==3){
				zn[cz]=i+1;
				cz++;
			}
		}
		int w=Math.min(Math.min(x, y), z);
		System.out.println(w);
		for (int i = 0; i < w; i++) {
			System.out.println(xn[i]+" "+yn[i]+" "+zn[i]);
		}
		
		
		
	}
}
