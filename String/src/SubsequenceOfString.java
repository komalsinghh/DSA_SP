import java.util.Scanner;

public class SubsequenceOfString {
	static boolean subsequence(String str,String s2) {
		int n=str.length();
		int j=0;
		for(int i=0;i<n&&j<s2.length();i++) {
			if(str.charAt(i)==s2.charAt(j))
				j++;
		}
		return (j==s2.length());
	}
	//Recursive
	/*static boolean subsequence(String str,String s2,int n,int m) {
		if(n==0)
			return false;
		if(m==0)
			return true;
		if(str.charAt(n-1)==str.charAt(m-1))
			return subsequence(str,s2,n-1,m-1);
		else
			return subsequence(str,s2,n-1,m);
	}*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Word");
		String s=sc.next();
		System.out.println("Enter another");
		String s2=sc.next();
		System.out.println(subsequence(s,s2));
		sc.close();
	}

}
