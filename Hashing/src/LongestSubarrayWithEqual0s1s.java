import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithEqual0s1s {
	static int binary(int[] arr,int n) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++) {
			arr[i]=arr[i]==0?-1:1;
		}
		int presum=0,res=0;
		for(int i=0;i<n;i++) {
			presum+=arr[i];
			if(presum==0)
				res=i+1;
			if(hm.containsKey(presum+n)) {
				if(i-hm.get(presum+n)>res)
					res=i-hm.get(presum+n);
			}
			else {
				hm.put(presum+n, i);
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
		System.out.println(binary(arr,n));
		sc.close();
	}

}
