import java.util.Scanner;

public class RepeatingElements {
	static int repeat(int[] arr,int n) {
		int slow=arr[0],fast=arr[0];
		do {
			slow=arr[slow];
			fast=arr[arr[fast]];
		}while(slow!=fast);
		slow=arr[0];
		while(slow!=fast) {
			slow=arr[slow];
			fast=arr[fast];
		}
		return slow;
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
		System.out.println(repeat(arr,n));
		sc.close();
	}

}
