import java.util.HashMap;
import java.util.Scanner;

public class CountDistinctinEveryWindow {
	static void window(int[] arr,int n,int k) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<k;i++)
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		System.out.print(hm.size());
		for(int i=k;i<n;i++) {
			hm.put(arr[i-k], hm.getOrDefault(arr[i-k], 0)-1);
			if(hm.get(arr[i-k])==0)
				hm.remove(arr[i-k]);
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
			System.out.print(" "+hm.size());
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
		System.out.println("Enter Window");
		int k=sc.nextInt();
		window(arr,n,k);
		sc.close();
	}

}
