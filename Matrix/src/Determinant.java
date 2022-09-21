import java.util.Scanner;

public class Determinant {
	static void getCofactor(int[][] arr,int[][] temp,int p,int q,int n) {
		int i=0,j=0;
		for(int row=0;row<n;row++) {
			for(int col=0;col<n;col++) {
				if(row!=p && col!=q) {
					temp[i][j++]=arr[row][col];
					if(j==n-1) {
						j=0;
						i++;
					}
				}
				
			}
		}
	}
	static int determinant(int[][] arr,int n) {
		if(n==1)
			return arr[0][0];
		int[][] temp=new int[n][n];
		int d=0,sign=1;
		for(int i=0;i<n;i++) {
			getCofactor(arr,temp,0,i,n);
			d+=sign*arr[0][i]*determinant(temp,n-1);
			sign=-sign;
		}
		return d;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size row and column");
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		System.out.println("Enter Elements in 2-D");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(determinant(arr,n));
		sc.close();
	}

}
