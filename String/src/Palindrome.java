import java.util.Scanner;

public class Palindrome {
	static boolean palindrome(String str) {
		int low=0,high=str.length()-1;
		while(low<=high) {
			if(str.charAt(low)!=str.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Word");
		String s=sc.next();
		System.out.println(palindrome(s));
		
		sc.close();
	}

}
