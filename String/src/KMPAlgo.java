import java.util.Scanner;

public class KMPAlgo {
	static void fillLPS(String str,int[] lps,int n) {
		int len=0,i=1;
		lps[0]=0;
		while(i<n) {
			if(str.charAt(i)==str.charAt(len)) {
				len++;
				lps[i]=len;
				i++;
			}
			else {
				if(len==0) {
					lps[i]=0;
					i++;
				}
				else {
					len=lps[len-1];
				}
			}
		}
	}
	static void KMPalgo(String str, String pattern,int n,int m){
		int[] lps=new int[m];
		fillLPS(pattern,lps,m);
		int i=0,j=0;
		while(i<n) {
			if(str.charAt(i)==pattern.charAt(j)) {
				i++;
				j++;
			}
			if(j==m) {
				System.out.print("Found Pattern at "+(i-j)+" ");
				j=lps[j-1];
			}
			else if(i<n && pattern.charAt(j)!=str.charAt(i)){
				if(j==0) {
					i++;
				}
				else {
					j=lps[j-1];
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word");
		String s = sc.nextLine();
		System.out.println("Enter Pattern");
		String p = sc.next();
		KMPalgo(s, p, s.length(), p.length());
		sc.close();
	}
}
