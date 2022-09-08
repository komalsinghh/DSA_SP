import java.util.Arrays;
import java.util.Scanner;

public class MinimumDiffArray {
	static int minm(int[] arr,int n) {
		Arrays.sort(arr);
		int res=Integer.MAX_VALUE;
		for(int i=1;i<n;i++) {
			res=Math.min(res, arr[i]-arr[i-1]);
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(minm(arr,n));
		sc.close();
	}

}
