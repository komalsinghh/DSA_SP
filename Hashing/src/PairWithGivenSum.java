import java.util.*;
public class PairWithGivenSum {
	static boolean pair(int[] arr,int n,int sum) {
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<n;i++) {
			if(hs.contains(sum-arr[i])) {
				return true;
			}
			hs.add(arr[i]);
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
		System.out.println("Enter sum");
		int s=sc.nextInt();
		System.out.println(pair(arr,n,s));
		sc.close();
	}

}
