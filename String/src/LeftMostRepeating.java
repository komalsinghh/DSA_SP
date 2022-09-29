import java.util.Arrays;
import java.util.Scanner;

public class LeftMostRepeating {
	//Efficient Approach-II
	static int left(String str) {
		boolean[] arr=new boolean[256];
		Arrays.fill(arr, false);
		int res=0;
		for(int i=str.length()-1;i>=0;i--) {
			if(arr[str.charAt(i)])
				res=i;
			else
				arr[str.charAt(i)]=true;
		}
		return res;
	}
	//Efficient Approach-I
	/*
	static int left(String str) {
		int[] arr=new int[256];
		Arrays.fill(arr, -1);
		int res=Integer.MAX_VALUE;
		for(int i=0;i<str.length();i++) {
			int index=arr[str.charAt(i)];
			if(index==-1) {
				arr[str.charAt(i)]=i;
			}
			else {
				res=Math.min(res,index);
			}
		}
		return (res==Integer.MAX_VALUE)?-1:res;
	}*/
	/*
	static int left(String str) {
		int[] arr=new int[256];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]++;
		}
		for(int i=0;i<256;i++) {
			if(arr[str.charAt(i)]>1) {
				return i;
			}
		}
		return -1;	
	}*/		
	  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Word");
		String s=sc.next();
		System.out.println(left(s));
		
		sc.close();
	}

}
