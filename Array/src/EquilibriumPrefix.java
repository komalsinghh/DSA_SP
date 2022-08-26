import java.util.Scanner;

public class EquilibriumPrefix {
	static boolean equilibrium(int[] arr,int n) {
		int lsum=0,sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		for(int i=0;i<n;i++) {
			if(lsum==(sum-arr[i])) {
				return true;
			}
			lsum+=arr[i];
			sum=sum-arr[i]; // to find the right sum
		}
		return false;
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
		System.out.println(equilibrium(arr,n));
		sc.close();
	}

}
