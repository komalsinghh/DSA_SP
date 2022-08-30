import java.util.Scanner;

public class CountOccurence {
	static int firstOccurence(int[] arr,int n,int x) {
		int low=0,high=n-1;
		while(low<=high) {
		int mid=(low+high)/2;
		if(arr[mid]<x) {
			low=mid+1;
		}
		else if(arr[mid]>x) {
			high=mid-1;
		}
		else {
				if(mid==0 || arr[mid-1]!=arr[mid]) {
					return mid;
				}
				else {
					high=mid-1;
				}
		}
		}
		return -1;
	}
	static int lastOccurence(int[] arr,int n,int x) {
		int low=0,high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]>x) {
				high=mid-1;
			}
			else if(arr[mid]<x) {
				low=mid+1;
			}
			else {
				if(mid==n-1 || arr[mid]!=arr[mid+1]) {
					return mid;
				}
				else {
					low=mid+1;
				}
			}
		}
		return -1;
	}
	static int check(int[] arr,int n,int x) {
		int first=firstOccurence(arr,n,x);
		if(first==-1) {
			return 0;
		}
		else {
		return lastOccurence(arr,n,x)-first+1;
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
		System.out.println(check(arr,n,x));
		sc.close();
	}

}
