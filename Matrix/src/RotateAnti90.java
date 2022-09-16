import java.util.Scanner;

public class RotateAnti90 {
	static void rotateby90(int[][] arr,int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for(int i=0;i<n;i++) {
			int low=0,high=n-1;
			while(low<high) {
				int temp=arr[low][i];
				arr[low][i]=arr[high][i];
				arr[high][i]=temp;
				low++;
				high--;
			}
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
		rotateby90(arr,n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
