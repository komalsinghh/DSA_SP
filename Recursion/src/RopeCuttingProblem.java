import java.util.*;

public class RopeCuttingProblem {
	static int rope(int n,int a,int b,int c) {
		if(n==0) {
			return 0;
		}
		if(n<1) {
			return -1;
		}
		int res=(int)(Math.max(rope(n-a,a,b,c),Math.max(rope(n-b,a,b,c),rope(n-c,a,b,c))));
		if(res==-1) {
			return -1;
		}
		return res+1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println("Enter a, b, c: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(rope(n,a,b,c));		
		sc.close();
	}

}
