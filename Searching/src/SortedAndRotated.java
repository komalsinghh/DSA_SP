import java.util.Scanner;

public class SortedAndRotated {
	static int check(int[] arr,int n,int x) {
		int low=0,high=n-1;
		while(low<=high) {
		int mid=(low+high)/2;	// 100 500 10 20 30 40 50
		if(arr[mid]==x) {
			return mid;
		}
		if(arr[low]<arr[mid]) {
		if(x>=arr[low] && x<arr[mid]) {
			high=mid-1;
		}
		else  {
			low=mid+1;
		
		}
		}
		else {
			if(x>arr[mid] && x<=arr[high]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
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
		System.out.println("Enter element to search");
		int x=sc.nextInt();
		System.out.println(check(arr,n,x));
		sc.close();
	}

}
