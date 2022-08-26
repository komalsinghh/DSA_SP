import java.util.*;

public class PrefixSumTechnique2 {
	//Efficient O(n)
	static int prefix(int[] l, int[] r,int n ) {
		int[] arr=new int[1000];
		for(int i=0;i<n;i++) {
			arr[l[i]]++;
			arr[r[i]+1]--;
		}
		int res=0,max=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i]+=arr[i-1];
			if(arr[i]>max) {
				max=arr[i];
				res=i;
			}
		}
		return res;
	}
	
	/*Naive Approach O(n^2)
	static int prefix(int[] l, int[] r,int n ) {
	int[] arr=new int[1000];
	Arrays.fill(arr, 0);
		for(int i=0;i<n;i++) {	// 1 2 5 15   	5 8 7 18
			for(int j=l[i];j<=r[i];j++) {
				arr[j]++;
			}
		}
		int max=arr[0],res=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				res=i;
			}
		}
		return res; 
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
		System.out.println("Enter another array");
		int[] r=new int[n];
		for(int i=0;i<n;i++) {
			r[i]=sc.nextInt();
		}
		System.out.println(prefix(arr,r,n));
		
		sc.close();
	}

}
