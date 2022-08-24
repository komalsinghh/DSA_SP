import java.util.Scanner;

public class MaximumConsecutive1s {
	static int consecutive1(int[] arr,int n) {
		int max=0,count=0;
		for(int i=1;i<n;i++) {
		if(arr[i]==1) {
			count++;
		}
		if(arr[i]!=1) {
			count=0;
		}
		max=Math.max(max, count);
		}
		return max;
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
		int res=consecutive1(arr,n);
		System.out.println(res);
		sc.close();
	}

}
