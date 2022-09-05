import java.util.Scanner;

public class CountOnlyRepeated {
	static int[] repeated(int[] arr,int n) {
		int[] ans=new int[2];
		int low=0,high=n-1,res=0;
		int count=(n-(arr[n-1]-arr[0]));
		if(count<=1) {
			ans[0]=-1;ans[1]=-1;
			return ans;
		}
		while(low<=high) {
			int mid=(low+high)/2;
			if((mid!=0 && arr[mid]==arr[mid-1])|| (mid!=n-1 && arr[mid]==arr[mid+1])) {
				res=arr[mid];
				break;
			}
			else if(arr[mid]>=arr[0]+mid) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		ans[0]=res;
		ans[1]=count;
		return ans;
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
		int[] ans=repeated(arr,n);
		for(int i=0;i<ans.length;i++) {
		System.out.print(ans[i]+" ");
		}
		sc.close();
	}

}
/*
Given an array arr[] of N positive integers, where elements are consecutive (sorted). Also, there is a single element which is repeating X (any variable) number of times. Now, the task is to find the element which is repeated and number of times it is repeated.
Note: If there's no repeating element, Return {-1,-1}.


Example 1:

Input:
N = 5
arr[] = {1,2,3,3,4}
Output: 3 2
Explanation: In the given array, 3 is 
occuring two times.
*/