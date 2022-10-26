import java.util.Scanner;

public class KMP_LPSArray {
	static void LPS(String str) {
		int[] lps = new int[str.length()];
		lps[0] = 0;
		int i = 1,len=0;
		while (i < str.length()) {
			if(str.charAt(i)==str.charAt(len)) {
				++len;
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
		for(int j=0;j<lps.length;j++) {
			System.out.print(lps[j]+" ");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word");
		String s = sc.next();
		LPS(s);

		sc.close();
	}

}
