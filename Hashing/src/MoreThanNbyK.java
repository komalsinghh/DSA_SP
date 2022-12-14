import java.util.*;

public class MoreThanNbyK {
	static void morethan(int[] arr,int n,int k) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<Integer,Integer> e:hm.entrySet()) {
			if(e.getValue()>n/k)
				System.out.print(e.getKey()+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter K");
		int k=sc.nextInt();
		morethan(arr,n,k);
		sc.close();
	}

}
