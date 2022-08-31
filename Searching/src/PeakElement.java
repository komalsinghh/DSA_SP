import java.util.Scanner;

public class PeakElement {
	static int check(int[] arr,int n) {
		int low=0,high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid]>=arr[mid+1])) {
				return arr[mid];
			}
			else if(mid>0 && arr[mid-1]>=arr[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
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

		System.out.println(check(arr,n));
		sc.close();
	}

}
