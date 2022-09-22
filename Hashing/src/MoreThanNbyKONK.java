import java.util.*;

public class MoreThanNbyKONK {
	static void morethan(int[] arr,int n,int k) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(hm.containsKey(arr[i])) {
				int count=hm.get(arr[i]);
				hm.put(arr[i], count+1);
			}
			else if(hm.size()<k-1)
				hm.put(arr[i], 1);
			else {
				for(Map.Entry<Integer,Integer> e:hm.entrySet()) {
					int c=e.getValue();
					hm.put(e.getKey(),c-1);
					if(e.getKey()==0)
						hm.remove(e.getKey());
				}
			}
		}
		for(Map.Entry<Integer,Integer> e:hm.entrySet()) {
			int count=0;
			for(int i=0;i<n;i++) {
				if(e.getKey()==arr[i])
					count++;
			}
			if(count>n/k)
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
