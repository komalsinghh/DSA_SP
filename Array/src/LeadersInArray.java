import java.util.Scanner;

public class LeadersInArray {
	static void leader(int[] arr,int n) {
		int temp=arr[n-1];
		System.out.print(temp+" ");
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>temp) {
				temp=arr[i];
				System.out.print(temp+" ");
			}
		}
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
		leader(arr,n);
		/*
		 * for(int i=0;i<n;i++) { System.out.print(arr[i]+" "); }
		 */
		sc.close();
	}

}
