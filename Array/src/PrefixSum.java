import java.util.Scanner;

public class PrefixSum {
	static int[] prefixSum(int[] arr,int n) {
	int[] prefix=new int[n];
	prefix[0]=arr[0];
	for(int i=1;i<n;i++) {
		prefix[i]=arr[i]+prefix[i-1];
	}
	return prefix;
	}
	static int getSum(int[] prefix,int l,int r) {
		int sum=0;
			if(l!=0)
			{
				sum=prefix[r]-prefix[l-1];
			}
			else
			{
				sum=prefix[r];
			}
			return sum;
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
		int[] prefix=prefixSum(arr,n);
		System.out.println(getSum(prefix,0,2));
		System.out.println(getSum(prefix,1,3));
		System.out.println(getSum(prefix,2,6));
		sc.close();
	}

}
