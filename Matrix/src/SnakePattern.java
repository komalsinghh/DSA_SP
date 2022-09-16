import java.util.Scanner;

public class SnakePattern {
	static void snake(int[][] arr,int n) {
		for(int i=0;i<n;i++) {
			if(i%2==0) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			}
			else {
				for(int j=n-1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}	
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size ");
	int n=sc.nextInt();
	int[][] arr=new int[n][n];
	System.out.println("Enter Elements in 2-D");
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	snake(arr,n);
	sc.close();
	}

}
