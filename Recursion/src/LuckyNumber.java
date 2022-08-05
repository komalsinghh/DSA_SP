import java.util.Scanner;

public class LuckyNumber {
	static int count=2;
	static boolean lucky(int n) {
		if(count>n)
			return true;
		if(n%count==0)
			return false;
		int pos=n-(n/count);
		count++;
		return lucky(pos);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println(lucky(n));
		sc.close();
	}

}
