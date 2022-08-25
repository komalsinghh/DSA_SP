import java.util.Scanner;

public class MaxmCircularSubarraySum {
	static int subarraySum(int[] arr, int n) {
		int res=arr[0],max=arr[0];
		for(int i=1;i<n;i++) {
			max=Math.max(max+arr[i],arr[i]);
			res=Math.max(max, res);
		}
		return res;
	}
	static int circularsubarraySum(int[] arr,int n) {
		int maxsum=subarraySum(arr,n);
		if(maxsum<0) {
			return maxsum;
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			arr[i]=-arr[i];
		}
		int circular=sum + subarraySum(arr,n);
		int res=Math.max(maxsum, circular);
		return res;
	}
	
	
	
	/*
	// Naive Approach-O(n^2)
	static int subarraySum(int[] arr, int n) {
		int max=arr[0],sum=arr[0],res=0,index=0;
		for(int i=0;i<n;i++) {
			max=arr[i];sum=arr[i];
			for(int j=1;j<n;j++) {
				index=(i+j)%n;
				sum=sum+arr[index];
				max=Math.max(max, sum);
				
			}
			res=Math.max(res, max);
		}
		return res;
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
		int res=circularsubarraySum(arr,n);
		System.out.println(res);
		sc.close();
	}

}
