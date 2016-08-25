import java.util.Scanner;

public class Expression {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a, b, c;
		a = in.nextInt();
		b = in.nextInt();
		c = in .nextInt();
		int max=0, temp=0;
		if((temp=a+b+c)>max) max=temp;
		if((temp=a+b*c)>max) max=temp;
		if((temp=(a+b)*c)>max) max=temp;
		if((temp=a*b+c)>max) max=temp;
		if((temp=a*(b+c))>max) max=temp;
		if((temp=a*b*c)>max) max=temp;
		System.out.println(max);
	}
}
