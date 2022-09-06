import java.util.Scanner;

public class SelectionSort {
	static void selection(int[] arr,int n) {
		int min=0;
		for(int i=0;i<n-1;i++) {
			min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
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
		selection(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	
	}

}
