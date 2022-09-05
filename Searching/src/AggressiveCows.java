import java.util.Scanner;

public class AggressiveCows {
	static boolean isCows(int[] arr,int n,int cows,int dist) {
		int count=1,coord=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]-coord>=dist) {
				coord=arr[i];
				count++;
			}
			if(count==cows) {
				return true;
			}
		}
		return false;
	}
	static int aggressive(int[] arr,int n,int cows) {
		int ans=-1,low=1,high=arr[n-1]-arr[0];
		while(low<=high) {
		int mid=(low+high)/2;
		if(isCows(arr,n,cows,mid)) {
			ans=mid;
			low=mid+1;
		}
		else
			high=mid-1;
		}
		return ans;
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
		System.out.println("Enter no. of cows");
		int cows=sc.nextInt();
		System.out.println(aggressive(arr,n,cows));
		sc.close();
	}

}
