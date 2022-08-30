import java.util.Scanner;

public class CheckArraySortedRotated {
	static boolean isIncreasing(int[] arr,int l,int r) {
		for(int i=l+1;i<=r;i++) {
			if(arr[i-1]>arr[i]) {
				return false;
			}
		}
		return true;
	}
	static boolean isdecreasing(int[] arr,int l,int r) {
		for(int i=l+1;i<=r;i++) {
			if(arr[i-1]<arr[i]) {
				return false;
			}
		}
		return true;
	}
	static boolean incRotated(int[] arr,int n,int minIndex,int maxIndex) {
		if(arr[0]<arr[n-1]) {
			return false;
		}
		return isIncreasing(arr,0,maxIndex) && isIncreasing(arr,minIndex,n-1);
	}
	static boolean decRotated(int[] arr,int n,int minIndex,int maxIndex) {
		if(arr[0]<arr[n-1]) {
			return false;
		}
		return isdecreasing(arr,0,maxIndex) && isdecreasing(arr,minIndex,n-1);
	}
	static boolean checkSortedRotated(int[] arr, int n) {
		int minIndex=0,maxIndex=0;
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[minIndex]) {
				minIndex=i;
			}
			if(arr[i]>arr[maxIndex]) {
				maxIndex=i;
			}
		}
		boolean res=false;
		if(maxIndex==minIndex-1) {
			res=incRotated(arr,n,minIndex,maxIndex);
		}
		if(minIndex==maxIndex-1) {
			res=decRotated(arr,n,minIndex,maxIndex);
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
		System.out.println(checkSortedRotated(arr,n));
		sc.close();
	}
}
