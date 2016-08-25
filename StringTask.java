import java.util.Scanner;


public class StringTask {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		char[] c = input.toLowerCase().toCharArray();
		int vowels=0;
		for (int i = 0; i < c.length; i++) {
			if(c[i]=='a' || c[i]=='o' || c[i]=='y' || c[i]=='e' || c[i]=='u' || c[i]=='i'){
				vowels++;
			}
		}
		char[] temp= new char[(c.length-vowels)*2];
		int j = 0;
		for (int i = 0; i < c.length; i++) {
			if(c[i]!='a' && c[i]!='o' && c[i]!='y' && c[i]!='e' && c[i]!='u' && c[i]!='i'){
				temp[j]='.';
				temp[++j]=c[i];
				j++;
			}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
	}

}
