import java.util.Scanner;

public class JosephusProbem {
	static int josephus(int n,int k) {
		if(n==1) {
			return 0;
		}
		else {
			return (josephus(n-1, k)+k)%n;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println("Enter k");
		int k=sc.nextInt();
		System.out.println(josephus(n,k));
		sc.close();
	}

}
