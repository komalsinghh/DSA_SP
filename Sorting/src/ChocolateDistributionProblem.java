import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistributionProblem {
	static int chocolate(int[] arr,int n,int m) {
		if(m>n) {
			return -1;
		}
		Arrays.sort(arr);
		int res=arr[m-1]-arr[0];
		for(int i=1;i+m-1<n;i++) {
			res=Math.min(res, arr[i+m-1]-arr[i]);
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
		System.out.println("Enter m");
		int m=sc.nextInt();
		System.out.println(chocolate(arr,n,m));
		sc.close();
	}

}
