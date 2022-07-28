import java.util.*;
public class countSetBits {
	static void countSet(int n) {
		//by using brian kerningam
		int res=0;
		while(n>0) {
			n=(n &(n-1));
			res++;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		countSet(n);
		sc.close();
	}

}
// ip=5
// op=2