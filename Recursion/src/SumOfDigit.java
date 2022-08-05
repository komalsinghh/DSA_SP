import java.util.Scanner;

public class SumOfDigit {
	static int sum(int n) {
		if(n<=9) {
			return n;
		}
		else
			return sum(n/10)+(n%10);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println(sum(n));
		sc.close();
		}

}
