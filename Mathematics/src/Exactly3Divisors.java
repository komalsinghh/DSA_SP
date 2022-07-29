import java.util.*;
public class Exactly3Divisors {
	static void isSeive(int n) {
		boolean[] isPrime=new boolean[n+1];
		Arrays.fill(isPrime, true);
		int count=0;
		for(int i=2;i<=n;i++) {
			if(isPrime[i]) {
				if(i*i<=n) {
				count++;
				}
				for(int j=i*i;j<=n;j=j+i) {
					isPrime[j]=false;
				}
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range");
		int n=sc.nextInt();
		isSeive(n);
		sc.close();

	}
}
