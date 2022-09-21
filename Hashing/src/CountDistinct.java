import java.util.*;

public class CountDistinct {
	static int distinct(Integer[] arr ,int n) {
	HashSet<Integer> h=new HashSet<>(Arrays.asList(arr));
		return h.size();
//		HashSet<Integer> h=new HashSet<>();
//		for(int i=0;i<n;i++)
//			h.add(arr[i]);
//		return h.size();
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Integer[] arr=new Integer[n];
	System.out.println("Enter elements");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println(distinct(arr,n));
	sc.close();
	
	}

}
