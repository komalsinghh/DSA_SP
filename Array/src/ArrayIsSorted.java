import java.util.Scanner;

public class ArrayIsSorted {
	//Efficient Method
	static boolean check(int[] arr,int n) {
		for(int i=1;i<n;i++) {
			if(arr[i-1]>arr[i])
				return false;
		}
		return true;
	}
/* Naive Approach
	static boolean check(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j])
					return false;
			}
		}
		return true;
	} */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(check(arr,n));
		sc.close();
		
	}

}
