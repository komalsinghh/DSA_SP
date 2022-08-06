import java.util.Scanner;

public class LuckyNumber {
	static boolean lucky(int n,int k) {
		if(k>n) {
			return true;
		}
		if(n%k==0) {
			return false;
		}
		return (lucky((n-n/k),k+1));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println(lucky(n,2));
		sc.close();
	}

}


/*static int count=2;
static boolean lucky(int n) {
	if(count>n)
		return true;
	if(n%count==0)
		return false;
	int pos=n-(n/count);
	count++;
	return lucky(pos);
}*/