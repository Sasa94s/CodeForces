import java.util.Scanner;


public class LuckyDivision {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String num2 = String.valueOf(num);
		int valid=0;
		for (int i = 0; i < num2.length(); i++) {
			if(num2.charAt(i)=='4') valid++;
			else if(num2.charAt(i)=='7') valid++;
		}
		if(num2.length()==valid) {
			System.out.println("YES");
			return;
		}
		boolean check = num%4==0 || num%7==0 || num%47==0 || num%74==0 || num%44==0 || num%77==0; 
		if(check) System.out.println("YES");
		else System.out.println("NO");
	}

}
