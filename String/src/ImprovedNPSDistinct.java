import java.util.Scanner;

public class ImprovedNPSDistinct {
	static void  pattern(String str,String pat) {
		int n=str.length();
		int m=pat.length();
		for(int i=0;i<=n-m;) {
			int j;
			for(j=0;j<m;j++) {
				if(pat.charAt(j)!=str.charAt(i+j))
					break;
					}
			if(j==m)
				System.out.print(i+" ");
			if(j==0)
				i++;
			else
				i=i+j;
			}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Word");
		String s=sc.next();
		System.out.println("Enter Pattern");
		String p=sc.next();
		pattern(s,p);
		sc.close();
	}

}
