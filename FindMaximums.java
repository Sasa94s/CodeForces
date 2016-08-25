import java.util.Scanner;


public class FindMaximums {

	public static void main(String[] args) {
		String input = "6 3\n8 4 8 2 3 7";
		//String output="";
		int i, j;
		Scanner sc = new Scanner(input);
		String aLine = sc.nextLine();
		String bLine = sc.nextLine();
		sc = new Scanner(aLine);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc = new Scanner(bLine);
		int[] arr = new int[n];
		for (i = 0; i < n; i++)
			arr[i]=sc.nextInt();
		int[][] list = new int[n-k+1][k];
		for (i = 0; i < n-k+1; i++) {
			for (j = 0; j < k; j++)
				list[i][j]=arr[j+i];
			boolean swap = true;
			while(swap){
				swap=false;
				for (j = 1; j < k; j++) {
					if(list[i][j]<list[i][j-1]){
						list[i][j-1] = list[i][j-1] + list[i][j];
						list[i][j] = list[i][j-1] - list[i][j];
						list[i][j-1] = list[i][j-1] - list[i][j];
						swap=true;
					}
				}
				
			}
			if (i != (n-k)) 
				System.out.print(list[i][k-1]+" ");
			else
				System.out.print(list[i][k-1]);

		}
		//System.out.println(Arrays.toString(arr));
	}
}
