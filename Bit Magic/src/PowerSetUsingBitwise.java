import java.util.*;
public class PowerSetUsingBitwise {
	static void printPower(String str) {
		int n=str.length();
		int powsize=(int)Math.pow(2, n);
		for(int i=1;i<powsize;i++) {
			for(int j=0;j<n;j++) {
				if((i & (1<<j))!=0) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		printPower(str);
		sc.close();

	}

}
