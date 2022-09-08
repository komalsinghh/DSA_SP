import java.util.Scanner;

public class QuickSortHoares {
	static int hpartition(int[] arr,int l,int h) {
		int i=l-1,j=h+1;
		int pivot=arr[l];
		while(true) {
			do {
				i++;
			}while(arr[i]<pivot);
			do {
				j--;
			}while(arr[j]>pivot);
			if(i>=j) {
				return j;
			}
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	static void qssort(int[] arr,int l,int h) {
		if(l<h) {
			int p=hpartition(arr,l,h);
			qssort(arr,l,p);
			qssort(arr,p+1,h);
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
		qssort(arr,0,n-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
