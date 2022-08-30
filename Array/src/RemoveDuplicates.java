import java.util.Scanner;

public class RemoveDuplicates {
	static int duplicate(int[] arr,int n) {
		int res=1;
		for(int i=1;i<n;i++) {
		if(arr[i]!=arr[res-1]) {
			arr[res++]=arr[i];
		}
		}
		for(int i=0;i<res;i++) {
			System.out.print(arr[i]+" ");
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
		n=duplicate(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
