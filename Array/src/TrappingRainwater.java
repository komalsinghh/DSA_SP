import java.util.Scanner;

public class TrappingRainwater {
	static int rainwater(int[] arr, int n) {
		int[] lmax=new int[n];
		int[] rmax=new int[n];
		lmax[0]=arr[0];
		int res=0;
		for(int i=1;i<n;i++) {
			lmax[i]=Math.max(arr[i], lmax[i-1]);
		}
		rmax[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			rmax[i]=Math.max(arr[i], rmax[i+1]);
		}
		for(int i=1;i<n;i++) {
			res=res+(Math.min(lmax[i],rmax[i])-arr[i]);
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
		int res=rainwater(arr,n);
		System.out.println(res);
		sc.close();
	}

}
