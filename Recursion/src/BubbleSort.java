import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	static void bubble(int[] arr,int r,int c) {
		if(r==0)
			return;
		if(c<r) {
			if(arr[c]>arr[c+1]) {
				int temp=arr[c];
				arr[c]=arr[c+1];
				arr[c+1]=temp;
			}
			bubble(arr,r,c+1);
		}
		else {
			bubble(arr,r-1,0);
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
		bubble(arr,n-1,0);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
