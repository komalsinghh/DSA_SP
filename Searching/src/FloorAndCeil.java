import java.util.Scanner;

public class FloorAndCeil {
	static int find(int[] arr,int n,int x) {
		int low=0,high=n-1;
		if(x<arr[0]) {
			return arr[0];
		}
		if(x>arr[n-1]) {
			return -1;
		}
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==x) {
				return arr[high];
			}
			else if(x>arr[mid]) {
				low=mid+1;
			}
			else
				high=mid-1;
		}
		return arr[low];
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
		System.out.println("Enter Number to find ceil");
		int x=sc.nextInt();
		System.out.println(find(arr,n,x));
		sc.close();
	}

}
