import java.util.*;

public class IntersectionOfTwoArrays {
	static int intersection(int[] arr,int n,int[] b,int m) {
		HashSet<Integer> h=new HashSet<>();
		for(int i=0;i<n;i++) {
			h.add(arr[i]);
		}
		int count=0;
		for(int i=0;i<m;i++) {
			if(h.contains(b[i])) {
				count++;
				h.remove(b[i]);
			}
		}
		return count;
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
		
		System.out.println(intersection(a,n,b,m));
		sc.close();
	}

}
