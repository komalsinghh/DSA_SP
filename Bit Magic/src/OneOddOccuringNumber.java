import java.util.*;
public class OneOddOccuringNumber {
	static void checkLeftOutNo(int[] arr) {
		int res=0;
		for(int i=0;i<arr.length;i++) {
			res=res^arr[i];
		}
		System.out.println(res);
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
		checkLeftOutNo(arr);
		sc.close();

	}

}
