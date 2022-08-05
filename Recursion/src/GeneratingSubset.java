import java.util.Scanner;

public class GeneratingSubset {
	static void printSubset(String st,String output) {
		if(st.length()==0) {
			System.out.println(output);
			return;
		}
		printSubset(st.substring(1), output);//to print the empty
		printSubset(st.substring(1), output+st.charAt(0));//to print character
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.next();
		printSubset(st,"");
		sc.close();
		}

}
