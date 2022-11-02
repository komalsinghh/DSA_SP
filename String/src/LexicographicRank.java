import java.util.Scanner;

public class LexicographicRank {
	static final int CHAR=256;
	static int fact(int n) {
		return (n<=1)?1:n*fact(n-1);
	}
	static int rank(String str, int len) {
		int[] count=new int[CHAR];
		int res=1;
		int mult=fact(len);
		for(int i=0;i<len;i++)
			count[str.charAt(i)]++;
		for(int i=1;i<CHAR;i++) 
			count[i]+=count[i-1];
		for(int i=0;i<len-1;i++) {
			mult=mult/(len-i);
			res=res+(count[str.charAt(i)-1]*mult);
			for(int j=str.charAt(i);j<CHAR;j++)
				count[j]--;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word");
		String s = sc.next();
		System.out.println(rank(s,s.length()));
		sc.close();
	}

}
