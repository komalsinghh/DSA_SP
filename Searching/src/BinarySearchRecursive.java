import java.util.Scanner;

public class BinarySearchRecursive {
	static int  check(int[] arr,int low,int high,int x) {
		if(low>high) 
			return -1;
		
		int mid=(low+high)/2;
		
		if(arr[mid]==x) 
			return mid;
	
		else if(arr[mid]>x) {
			return check(arr,low,mid-1,x);
		}
		else {
			return check(arr,mid+1,high,x);
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
		System.out.println("Enter Number to search");
		int x=sc.nextInt();
		int low=0,high=n-1;
		System.out.println(check(arr,low,high,x));
		
		sc.close();
	}

}
