import java.util.*;
public class CountDigit {
	static int countDigit(long n)
    {
        return (int)Math.floor(Math.log10(n) + 1);
    }
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println(countDigit(n));
		sc.close();
	}

}
