import java.util.Scanner;

public class KthSmallest {
	static int lomuto(int[] arr,int l,int h) {
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
	static int ksmall(int[] arr,int n,int k) {
		int low=0,high=n-1;
		while(low<=high) {
			int pivot=lomuto(arr,low,high);
			if(pivot==k-1) {
				return arr[pivot];
			}
			else if(pivot>k-1) {
				high=pivot-1;	
			}
			else {
				low=pivot+1;
			}
		}
		return -1;
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
		System.out.println("Enter K");
		int k=sc.nextInt();
		System.out.println(ksmall(arr,n,k));
		sc.close();
	}

}
