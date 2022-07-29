import java.util.*;
public class SeiveOfEratosthenes {
	static void isSeive(int n) {
		boolean[] isPrime=new boolean[n+1];
		Arrays.fill(isPrime, true);
		for(int i=2;i<=n;i++) {
			if(isPrime[i]) {
				System.out.print(i+" ");
				for(int j=i*i;j<=n;j=j+i) {
					isPrime[j]=false;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range");
		int n=sc.nextInt();
		isSeive(n);
		sc.close();

	}

}
