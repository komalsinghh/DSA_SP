import java.util.*;
public class KthSetBit {
	static void kthBitSet(int n, int k) {
		if((n & (1<<(k-1)))!=0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
			
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println("Enter K");
		int k=sc.nextInt();
		kthBitSet(n,k);
		sc.close();
	}

}
