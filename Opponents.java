import java.util.Arrays;
import java.util.Scanner;


public class Opponents {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line=in.nextLine();
		Scanner sc = new Scanner(line);
		byte d = sc.nextByte();
		byte n = sc.nextByte();
		String[] lines = new String[n];
		short c=0, max=0;
		boolean consecutive = false;
		for (int i = 0; i < n; i++) {
			lines[i]=in.nextLine();
			//System.out.println("IM ALIVE at "+i+" where line="+lines[i]);
			if(lines[i].contains("0")){
				if(consecutive==false) c=0;
				c++;
				consecutive = true;
				if(c>max) max=c;
			} else {
				if(c>max) max=c;
				consecutive = false;
			}
		}
		System.out.println(max);
	}

}
