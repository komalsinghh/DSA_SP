import java.util.Scanner;

public class Segregate0s1s {
	static void dutch(int[] arr,int n) {
		int i=0,j=n-1;
		while(i<j) {
			while(arr[i]==0 && i<j) {
				i++;
			}
			while(arr[j]==1 && i<j) {
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		dutch(arr,n);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
