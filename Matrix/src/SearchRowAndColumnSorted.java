import java.util.Scanner;

public class SearchRowAndColumnSorted {
	static void search(int[][] arr,int r,int c,int x) {
		int i=0,j=c-1;
		while(i<r && j>=0) {
			if(arr[i][j]==x) {
				System.out.println("Found at "+i+","+j);
				return;
			}
			else if(arr[i][j]>x)
				j--;
			else
				i++;
		}
		System.out.println("Not Found");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size row and column");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		System.out.println("Enter Elements in 2-D");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter element to search");
		int x=sc.nextInt();
		search(arr,n,m,x);
		sc.close();
	}

}
