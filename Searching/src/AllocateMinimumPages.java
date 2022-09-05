import java.util.Scanner;

public class AllocateMinimumPages {
	static boolean isFeasible(int[] arr,int n,int k,int ans) {
		int sum=0,req=1;
		for(int i=0;i<n;i++) {
			if(sum+arr[i]>ans) {
				req++;
				sum=arr[i];
			}
			else {
				sum+=arr[i];
			}
		}
		return (req<=k);
	}
	static int allocate(int[] arr,int n,int k) {
		int sum=0,max=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			max=Math.max(max, arr[i]);
		}
		int low=max,high=sum,res=0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(isFeasible(arr,n,k,mid)) {
				res=mid;
				high=mid-1;
			}
			else {
				low=mid+1;
			}
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
		System.out.println("Enter Number of Students");
		int x=sc.nextInt();
		System.out.println(allocate(arr,n,x));
		sc.close();
	}

}
