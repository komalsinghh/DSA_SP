import java.util.Scanner;

public class BoundaryTraversal {
	static void boundary(int[][] arr,int r,int c) {
		if(r==1) {
			for(int i=0;i<c;i++) {
				System.out.print(arr[0][i]+" ");
			}
		}
		else if(c==1) {
			for(int i=0;i<r;i++) {
				System.out.print(arr[i][0]+" ");
			}
		}
		else {
			for(int i=0;i<c;i++) {
				System.out.print(arr[0][i]+" ");
			}
			for(int i=1;i<r;i++) {
				System.out.print(arr[i][c-1]+" ");
			}
			for(int i=c-2;i>=0;i--) {
				System.out.print(arr[r-1][i]+" ");
			}
			for(int i=r-2;i>0;i--) {
				System.out.print(arr[i][0]+" ");
			}
		}
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
		boundary(arr,n,m);
		sc.close();
	}

}
