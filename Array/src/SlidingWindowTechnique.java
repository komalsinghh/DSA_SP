import java.util.Scanner;

public class SlidingWindowTechnique {
	//Using Sliding Window Technique
	static int window(int[] arr,int n, int k) {
		int cursum=0;
		for(int i=0;i<k;i++) {
			cursum+=arr[i];
		}
		int ans=cursum;
		for(int i=k;i<n;i++) {
			cursum+=arr[i]-arr[i-k];
			ans=Math.max(ans, cursum);
		}
		return ans;
	}
	
	/* Naive Approach
	static int window(int[] arr,int n, int k) {
		// 5 -10 6 90 3 k=2
		int max=Integer.MIN_VALUE;
		for(int i=0;i+k-1<n;i++) {
			int sum=0;
			for(int j=0;j<k;j++) {
			sum+=arr[i+j];
			}
			max=Math.max(max, sum);
		}
		
		return max;
	}*/
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
		int ans=window(arr,n,k);
		System.out.println(ans);
		sc.close();
	}

}
