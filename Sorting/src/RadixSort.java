import java.util.Scanner;

public class RadixSort {
	static void countingsort(int[] arr,int n,int exp) {
		int count[]=new int[10];
		int output[]=new int[n];
		for(int i=0;i<n;i++) {
			count[(arr[i]/exp)%10]++;
		}
		for(int i=1;i<10;i++) {
			count[i]+=count[i-1];
		}
		for(int i=n-1;i>=0;i--) {
			output[count[(arr[i]/exp)%10]-1]=arr[i];
			count[(arr[i]/exp)%10]--;
		}
		for(int i=0;i<n;i++) {
			arr[i]=output[i];
		}
	}
	static void radixsort(int[] arr,int n) {
		int max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		for(int exp=1;max/exp>0;exp*=10) {
			countingsort(arr,n,exp);
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
		radixsort(arr,n);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		sc.close();
	
	}

}
