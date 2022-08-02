import java.util.Scanner;

public class Palindrome {
	static boolean checkPali(String str,int start,int end) {
		if(start>=end) {
			return true;
		}
		return (str.charAt(start)==str.charAt(end))&&(checkPali(str,start+1,end-1));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.next();
		int start=0,end=st.length();
		System.out.println(checkPali(st,start,end-1));
		sc.close();
	}

}
