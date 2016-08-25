import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int gradeBook[][] = new int[n][m];
		in.nextLine();
		String line;
		for (int i = 0; i < n; i++) {
			line = in.nextLine();
			for (int j = 0; j < m; j++) {
				gradeBook[i][j]=line.charAt(j);
			}
		}
		int max=0;
		int skip[] = new int[n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(max<gradeBook[j][i]){
					max=gradeBook[j][i];
				}
			}
			for (int j = 0; j < n; j++) {
				if(max==gradeBook[j][i] && skip[j]!=1){
					skip[j]=1;
				}
			}
			max=0;
		}
		int c=0;
		for (int i = 0; i < n; i++) {
			if(skip[i]==1) c++;
		}
		System.out.println(c);
	}

}
