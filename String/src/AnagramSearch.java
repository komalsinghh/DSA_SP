import java.util.Scanner;

public class AnagramSearch {
	// Efficient code T.C-O(n)
	final static int CHAR = 256;

	static boolean areSame(int CT[], int CP[]) {
		for (int i = 0; i < CHAR; i++) {
			if (CT[i] != CP[i])
				return false;
		}
		return true;
	}

	static boolean anagramSearch(String str, String pattern, int n, int m) {
		int[] ct = new int[CHAR];
		int[] cp = new int[CHAR];
		for (int i = 0; i < m; i++) {
			ct[str.charAt(i)]++;
			cp[pattern.charAt(i)]++;
		}
		for (int i = m; i < n; i++) {
			if (areSame(ct, cp)) {
				return true;
			}
			ct[str.charAt(i)]++;
			ct[str.charAt(i - m)]--;
		}
		return false;
	}

	/*static boolean areAnagram(String pat, String txt,int i) 
    { 
        int[] count=new int[CHAR];
    for(int j=0;j<pat.length();j++){
        count[pat.charAt(j)]++;
        count[txt.charAt(i+j)]--;
    }
    for(int j=0;j<CHAR;j++){
        if(count[j]!=0)return false;
    }
    return true;
    } 
    
    static boolean isPresent(String txt,String pat){
    int n=txt.length();
    int m=pat.length();
    for(int i=0;i<=n-m;i++){
        if(areAnagram(pat,txt,i))return true;
    }
    return false;
    }*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word");
		String s = sc.nextLine();
		System.out.println("Enter another word");
		String p = sc.next();
		if (anagramSearch(s, p, s.length(), p.length())) {
			System.out.println("Anagram Search is Found!");
		} else {
			System.out.println("Not Found...");
		}
		sc.close();
	}

}
