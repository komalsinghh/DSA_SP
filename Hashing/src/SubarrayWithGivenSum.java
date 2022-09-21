import java.util.HashSet;
import java.util.Scanner;

public class SubarrayWithGivenSum {
	static boolean subarray(int[] arr,int n,int sum) {
		HashSet<Integer> hs=new HashSet<>();
		int pre=0;
		for(int i=0;i<n;i++) {
			pre+=arr[i];
			if(pre==sum)
				return true;
			if(hs.contains(pre-sum))
				return true;
			hs.add(pre);
			
		}
		return false;
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
