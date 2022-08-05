import java.util.*;
//program to print all the subset of an array
public class SubsetSum {
	static void subset(int index,int sum,int[] arr,int n, ArrayList<Integer> a) {
		if(index==n) {
			a.add(sum);
			return;
		}
		subset(index+1,sum+arr[index],arr,n,a);//pick up the element
		subset(index+1,sum,arr,n,a);//do not pick up the element

	}
	static void findSum(int[] arr,int n, int sum) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		subset(0,0,arr,n,ar);
		Collections.sort(ar);
		System.out.println(ar);
		/*
		 * int count=0; for(int i:ar) { if(i==sum) count++; } System.out.println(count);
		 */
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
		System.out.println("Enter Sum");
		int sum=sc.nextInt();
		//System.out.println("Enter Sum");
		//int sum=sc.nextInt();
		findSum(arr,n,sum);
		sc.close();
	}

}
//using bit manipulation Time Complexity=O(2^n)*n
/*
static void findSum(int[] arr,int n) {
	int powsize=(int)Math.pow(2, n);
	int sum=0;
	for(int i=0;i<powsize;i++) {
		sum=0;
		for(int j=0;j<n;j++) {
			if((i&(1<<j))!=0) {
				 sum+=arr[j];
			}
		}
		System.out.println(sum);
	}
}
*/