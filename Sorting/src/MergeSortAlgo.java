import java.util.Scanner;

public class MergeSortAlgo {
	static void merging(int[] arr,int low,int mid,int high) {
		int ls=mid-low+1,rs=high-mid;
		int[] l=new int[ls];
		int[] r=new int[rs];
		for(int i=0;i<ls;i++) {
			l[i]=arr[i+low];
		}
		for(int j=0;j<rs;j++) {
			r[j]=arr[j+mid+1];//+1 because mid occur earlier
		}
		int i=0,j=0,k=low;
		while(i<ls && j<rs) {
			if(l[i]<=r[j]) {
				arr[k++]=l[i++];
			}
			else {
				arr[k++]=r[j++];
			}
		}
		while(i<ls) {
			arr[k++]=l[i++];
		}
		while(j<rs) {
			arr[k++]=r[j++];
		}
	}
	static void merge(int[] arr,int low,int high) {
		if(high>low) {
			int mid=low+(high-low)/2;
			merge(arr,low,mid);
			merge(arr,mid+1,high);
			merging(arr,low,mid,high);
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
		int low=0,high=n-1;
		merge(arr,low,high);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
