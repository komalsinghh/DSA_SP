import java.util.Scanner;

public class MaximumDifferenceWithOrder {
	static int difference(int[] arr,int n) {
		int res=arr[1]-arr[0],min=arr[0];
		for(int i=1;i<n;i++) {
			res=Math.max(res, arr[i]-res);
			min=Math.min(min, arr[i]);
		}
		return res;
	}
	
	/* tc-O(n)
	static int difference(int[] arr,int n) {
		int temp=Integer.MIN_VALUE;
		int max=0;
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				max=arr[j]-arr[i];
				if(max>temp) {
					temp=max;
				}
			}
		}
		return temp;
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
		int res=difference(arr,n);
		System.out.println(res);
		sc.close();
	}

}
