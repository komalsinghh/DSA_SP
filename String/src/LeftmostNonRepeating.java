import java.util.Arrays;
import java.util.Scanner;

public class LeftmostNonRepeating {
	static int nonRepeat(String str) {
		//Efficient Approach
	int[] arr=new int[256];
	Arrays.fill(arr, -1);
	for(int i=0;i<str.length();i++) {
		if(arr[str.charAt(i)]==-1) {
			arr[str.charAt(i)]=i;
		}
		else
			arr[str.charAt(i)]=-2;
	}
	int res=Integer.MAX_VALUE;
	for(int i=0;i<256;i++) {
		if(arr[i]>=0)
			res=Math.min(res, arr[i]);
	}
	return (res==Integer.MAX_VALUE)?-1:res;
	
		//Better Solution
	/*	int[] arr=new int[256];
		Arrays.fill(arr, 0);
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++) {
			if(arr[str.charAt(i)]==1)
				return i;
		}
		return -1;
	*/
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Word");
		String s=sc.next();
		System.out.println(nonRepeat(s));
		sc.close();
	}

}
