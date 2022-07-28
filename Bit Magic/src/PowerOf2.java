import java.util.*;
public class PowerOf2 {
	static boolean checkTwo(int n) {
		if(n==0)
			return false;
		return ((n & (n-1))==0);
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println(checkTwo(n));
		sc.close();

	}

}
//ip=4
//op=yes
//ip=6
//op=no