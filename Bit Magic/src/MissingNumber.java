import java.util.*;
public class MissingNumber {
	static void checkMissingNo(int[] arr) {
		int n=arr.length,res=0;
		for(int i=1;i<n;i++) {
			res=res^i;
			res=res^arr[i-1];
		}
		System.out.println(res^n);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		checkMissingNo(arr);
		sc.close();

	}

}
