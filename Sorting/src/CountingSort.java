
import java.util.Scanner;

//T.C-O(n+k)
public class CountingSort {
	static void countsort(int[] arr,int n,int k) {
		int[] count=new int[k];
		 for(int i=0;i<k;i++)
	            count[i]=0;
		for(int i=0;i<n;i++) {
			count[arr[i]]++;
		}
		for(int i=1;i<k;i++) {
		 count[i]+=count[i-1];
		}
		int[] op=new int[n];
		for(int i=n-1;i>=0;i--) {
			op[count[arr[i]]-1]=arr[i];
			count[arr[i]]--;
		}
		for(int i=0;i<n;i++) {
			arr[i]=op[i];
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
		System.out.println("Enter K");
		int k=sc.nextInt();
		countsort(arr,n,k);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
