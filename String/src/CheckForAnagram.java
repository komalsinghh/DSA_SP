import java.util.Scanner;

public class CheckForAnagram {
	final static int n=256;
	static boolean anagram(String str,String s2) {
		int[] arr=new int[n];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]++;
			arr[s2.charAt(i)]--;
		}
		for(int i=0;i<n;i++) {
			if(arr[i]!=0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Word");
		String s=sc.next();
		System.out.println("Enter another");
		String s2=sc.next();
		System.out.println(anagram(s,s2));
		sc.close();
	}

}
