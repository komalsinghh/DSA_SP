import java.util.HashMap;
import java.util.Scanner;

public class LongestCommonSpanBinary {
	static int binary(int[] arr,int[] b,int n) {
		int[] temp=new int[n];
		for(int i=0;i<n;i++) {
			temp[i]=arr[i]-b[i];	
		}
		int presum=0,res=0;
		HashMap<Integer, Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++) {
			presum+=temp[i];
			if(presum==0) {
				res=i+1;
			}
			if(hm.containsKey(presum))
				res=Math.max(res, i-hm.get(presum));
			else
				hm.put(presum, i);
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
		int[] b=new int[n];
		System.out.println("Enter another elements");
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println(binary(arr,b,n));
		sc.close();
	}

}
