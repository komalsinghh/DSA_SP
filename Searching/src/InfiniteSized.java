import java.util.Scanner;

public class InfiniteSized {
	//Efficient Approach O(log(position))
	static int bsearch(int[] arr,int x,int low,int high) {
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==x) {
				return mid;
			}
			else if(arr[mid]>x) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}
	static int check(int[] arr,int n,int x) {
		int i=1;
		if(arr[0]==x) {
			return 0;
		}
		while(arr[i]<x) {
			i=i*2;
		}
			if(arr[i]==x) {
				return x;
			}
			
		return bsearch(arr,x,i/2+1,i-1);
	}
	
	//Naive Approach O(position)
	/*
	static int check(int[] arr,int n,int x){
		int i=0;
		while(true) {
			if(arr[i]==x) {
				return i;
			}
			if(arr[i]>x) {
				return -1;
			}
			i++;
		}
	}*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to search");
		int x=sc.nextInt();
		System.out.println(check(arr,n,x));
		sc.close();
	}

}
