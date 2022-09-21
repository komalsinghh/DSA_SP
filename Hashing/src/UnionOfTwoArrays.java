import java.util.*;
public class UnionOfTwoArrays {
	static int union(int[] arr,int n,int[] b,int m) {
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<n;i++) {
			hs.add(arr[i]);
		}
		for(int i=0;i<m;i++) {
			hs.add(b[i]);
		}
		return hs.size();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of First");
		int n=sc.nextInt();
		System.out.println("Enter size of Second");
		int m=sc.nextInt();
		
		int[] a=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int[] b=new int[m];
		System.out.println("Enter elements");
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		
		System.out.println(union(a,n,b,m));
		sc.close();
	}

}
