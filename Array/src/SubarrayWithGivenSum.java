import java.util.Scanner;

public class SubarrayWithGivenSum {
	static boolean subarraySum(int[] arr, int n,int sum) {
		int start=0,curr=0;
		for(int e=0;e<n;e++) {
			curr+=arr[e];
			while(curr>sum) {
				curr=curr-arr[start];
				start++;
			}
			if(curr==sum) {
				return true;
			}
		}
		return false;
	}
	
	/*Naive Approach - O(n^2)
	static boolean subarraySum(int[] arr, int n,int sum) {
		int s=0;
		for(int i=0;i<n;i++) {
			s=0;
			// 1 4 0 0 3 10 5	7
			for(int j=i;j<n;j++) {
				s+=arr[j];
				if(s==sum) {
					return true;
				}
			}
		}
		return false;
	} */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Sum ");
		int sum=sc.nextInt();
		System.out.println(subarraySum(arr,n,sum));
		sc.close();
	}

}
