import java.util.Scanner;

public class TowerOfHanoi {
	static void Toh(int n, char a,char b,char c) {
		if(n==1) {
			System.out.println("Move disk 1 from "+a+" to "+c);
			return;
		}
		Toh(n-1,a,c,b); 
		System.out.println("Move disk "+n+" from "+a+" to "+c);
		Toh(n-1,b,a,c);
	}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter n");
			int n=sc.nextInt();
			Toh(n,'a','b','c');
			System.out.println("Total count "+(int)(Math.pow(2, n)-1));
			
			sc.close();
	}

}
