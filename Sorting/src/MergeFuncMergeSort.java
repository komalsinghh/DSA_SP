import java.util.Scanner;

public class MergeFuncMergeSort {
	static void merging(int[] arr,int low,int high,int mid) {
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
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter low");
		int l=sc.nextInt();
		System.out.println("Enter high");
		int h=sc.nextInt();
		System.out.println("Enter mid");
		int mid=sc.nextInt();
		
		merging(arr,l,h,mid);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
