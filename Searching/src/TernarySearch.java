import java.util.Scanner;

public class TernarySearch {
	static int find(int[] arr,int n,int x) {
		int low=0,high=n-1;
		while(low<=high) {
		int mid1=low+(high-low)/3;
		int mid2=high-(high-low)/3;
		if(arr[mid1]==x) {
			return mid1;
		}
		if(arr[mid2]==x) {
			return mid2;
		}
		else if(arr[mid1]>x) {
			high=mid1-1;
		}
		else if(x>arr[mid2]) {
			low=mid2+1;
		}
		else {
			low=mid1+1;
			high=mid2-1;
		}
		}
		return -1;
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
		System.out.println("Enter Number to Search");
		int x=sc.nextInt();
		System.out.println(find(arr,n,x));
		sc.close();
	}

}
