import java.util.Scanner;

public class IWannaBeTheGuy {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count=0, temp=0, count1=0, count2=0;
		int[] a = new int[n];
		in.nextLine();
		String line1 = in.nextLine();
		String line2 = in.nextLine();
		in = new Scanner(line1);
		count1 = in.nextInt();
		while(in.hasNextInt()) {
			temp=in.nextInt();
			for (int j = 0; j < n; j++) {
				if(j+1 == temp) a[j]++;
			}
		}
		in = new Scanner(line2);
		count2 = in.nextInt();
//		if(count1<count2) {
//			System.out.println("Oh, my keyboard!");
//			return;
//		}
		while(in.hasNextInt()) {
			temp=in.nextInt();
			for (int j = 0; j < n; j++) {
				if(j+1 == temp) a[j]++;
			}
		}
		for (int i = 0; i < n; i++) {
			if(a[i]>0) count++;
		}
		if(count==n) System.out.println("I become the guy.");
		else System.out.println("Oh, my keyboard!");
	}

}
