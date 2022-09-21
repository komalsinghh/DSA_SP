import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithGivenSum {
	static int subarray(int[] arr,int n,int sum) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		int presum=0,res=0;
		for(int i=0;i<n;i++) {
			presum+=arr[i];
			if(presum==sum)
				res = i+1;
			if(!hm.containsKey(presum)) {
				hm.put(presum, i);
			}
			if(hm.containsKey(presum-sum)) {
				if(i-hm.get(presum-sum)>res)
					res=i-hm.get(presum-sum);
			}
		} 
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Sum");
		int sum=sc.nextInt();
		System.out.println(subarray(arr,n,sum));
		sc.close();
	}

}
