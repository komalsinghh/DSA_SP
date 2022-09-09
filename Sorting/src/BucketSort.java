import java.util.*;

//to sort an array range from 0-10^8
public class BucketSort {
	static void bucketsort(int[] arr,int n,int k) {
		int max=arr[0];
		for(int i=1;i<n;i++) {
			max=Math.max(max, arr[i]);
		}
		max++;
		ArrayList<ArrayList<Integer>> bkt=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<k;i++) {
			bkt.add(new ArrayList<Integer>());
		}
		for(int i=0;i<n;i++) {
			int bi=(k*arr[i])/max;
			bkt.get(bi).add(arr[i]);
		}
		for(int i=0;i<k;i++) {
			Collections.sort(bkt.get(i));
		}
		int index=0;
		for(int i=0;i<k;i++) {
			for(int j=0;j<bkt.get(i).size();j++) {
				arr[index++]=bkt.get(i).get(j);
			}
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
		System.out.println("Enter Buckets");
		int k=sc.nextInt();
		bucketsort(arr,n,k);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
