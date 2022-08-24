import java.util.Scanner;

public class StockBuySell {
	static int buyandsell(int[] arr,int n) {
		int profit=0;
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1]) {
				profit+=(arr[i]-arr[i-1]);
			}
		}
		return profit;
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
		int ans=buyandsell(arr,n);
		System.out.println("Maximum Profit "+ans);
		sc.close();
	}

}
