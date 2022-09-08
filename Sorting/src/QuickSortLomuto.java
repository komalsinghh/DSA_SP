import java.util.Scanner;

public class QuickSortLomuto {
	static int lpartition(int[] arr,int l,int h) {
		int pivot=arr[h];
		int i=l-1;
		for(int j=l;j<=h;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp;
		return i+1;
	}
	static void qssort(int[] arr,int l,int h) {
		if(l<h) {
			int p=lpartition(arr,l,h);
			qssort(arr,l,p-1);
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
