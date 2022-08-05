import java.util.Scanner;

public class PermutationOfString {
	static String swap(String s,int i,int j) {
		char temp;
		char[] arr=s.toCharArray();
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return String.valueOf(arr);
	}
	static void printPermu(String str,int i) {
		if(i==str.length()-1) {
			System.out.println(str);
		}
		else {
			for(int j=i;j<=str.length()-1;j++) {
				str=swap(str,i,j);
				printPermu(str,i+1);
				str=swap(str,i,j);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.next();
		printPermu(st,0);
		sc.close();
	}

}
