import java.util.Scanner;

public class LeftRotateByD {
	static void rotate(int[] arr,int n, int k) {
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		reverse(arr,0,n-1);
	}
	static void reverse(int[] arr,int low, int high) {
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}
	
	/*
	//Better Method tc-O(n) sc-O(n)
	static void rotate(int[] arr,int n, int k) {
	int[] temp=new int[k];
	for(int i=0;i<k;i++) {
		temp[i]=arr[i];
	}
	for(int i=k;i<n;i++) {
		arr[i-k]=arr[i];
	}
	for(int i=0;i<k;i++) {
		arr[n-k+i]=temp[i];
	}*/
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the shifting position");
		int k=sc.nextInt();
		rotate(arr,n,k);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
