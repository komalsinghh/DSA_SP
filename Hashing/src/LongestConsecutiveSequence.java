import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {
	static int sequence(int[] arr,int n) {
		HashSet<Integer> hs=new HashSet<>();
		int res=0;
		for(int i:arr)
			hs.add(i);
		for(int i=0;i<n;i++) {
			if(!hs.contains(arr[i]-1)) {
				int curr=1;
				while(hs.contains(arr[i]+curr)) {
					curr++;
				}
				res=(int)Math.max(res, curr);
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
		System.out.println(sequence(arr,n));
		sc.close();
	}

}
