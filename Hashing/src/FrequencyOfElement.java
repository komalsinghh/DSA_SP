import java.util.*;

public class FrequencyOfElement {
	static void frequency(int[] arr,int n) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<Integer,Integer> m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		frequency(arr,n);
		sc.close();
	}

}
