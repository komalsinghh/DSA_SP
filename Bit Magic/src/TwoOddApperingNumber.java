import java.util.*;
public class TwoOddApperingNumber {
	static void checkOddAppearingNo(int[] arr) {
		int res1=0,res2=0,xor=0;
		for(int i=0;i<arr.length;i++) {
			xor=xor^arr[i];
		}
		int sn=xor & ~(xor-1);
		for(int i=0;i<arr.length;i++) {
			if((arr[i]&sn) != 0) { //here we are doing AND so that similar element from array will cancel out by sn
				res1=res1^arr[i];
			}
			else {
				res2=res2^arr[i];
			}
		}
		System.out.println("Missing Element"+res1+" "+res2);
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
		checkOddAppearingNo(arr);
		sc.close();
	}

}
//i/p={3,4,3,4,8,4,4,32,7,7}
//op=8 32
//ip={3,4,3,4,5,4,4,6,7,7}
//op=5 6 