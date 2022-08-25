import java.util.Scanner;

public class MaximumSubarraySum {
	//Efficient Approach O(n)
	static int subarraySum(int[] arr, int n) {
		int res=arr[0],max=arr[0];
		for(int i=1;i<n;i++) {
			max=Math.max(max+arr[i],arr[i]);
			res=Math.max(max, res);
		}
		return res;
	}
	
	/* Naive Approach O(n^2)
	static int subarraySum(int[] arr, int n) {
		int max=0,res=0;
		for(int i=0;i<n;i++) {
			max=0;
			for(int j=i;j<n;j++) {
				max=max+arr[j];
				res=Math.max(res, max);
			}
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
		int res=subarraySum(arr,n);
		System.out.println(res);
		sc.close();
	}

}
