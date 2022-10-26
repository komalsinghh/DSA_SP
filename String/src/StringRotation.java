import java.util.Scanner;

public class StringRotation {
	static boolean areRotation(String s1,String s2,int n,int m) {
		if(n!=m)
			return false;
		return (s1+s1).indexOf(s2)>=0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word");
		String s = sc.nextLine();
		System.out.println("Enter another word");
		String p = sc.next();
		if(areRotation(s, p, s.length(), p.length())) {
			System.out.println("They are rotation of each other!");
		}
		else {
			System.out.println("No, they are not...");
		}
		sc.close();
	}

}
