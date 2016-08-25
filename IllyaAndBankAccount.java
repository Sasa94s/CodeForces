import java.util.Scanner;

public class IllyaAndBankAccount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String balance = in.next();
		StringBuilder temp = new StringBuilder(balance);
		int i, max=Integer.parseInt(balance);
		if(balance.charAt(0)=='-') i=1;
		else i=0;
		boolean sign=true;
		if(i==1) sign=false;
		if(max<Integer.parseInt(temp.deleteCharAt(balance.length()-1).toString())) max=Integer.parseInt(temp.toString());
		temp = new StringBuilder(balance);
		if(max<Integer.parseInt(temp.deleteCharAt(balance.length()-2).toString())) max=Integer.parseInt(temp.toString());
		System.out.println(max);
		
		
	}

}
