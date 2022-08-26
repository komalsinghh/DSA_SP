import java.util.Scanner;

public class MinimumConsecutiveFlip {
	static void flip(int[] arr,int n) {	//0 0 1 1 0 0 1 1 0 1
		for(int i=1;i<n;i++) {
			if(arr[i]!=arr[i-1]) {
				if(arr[i]!=arr[0]) {
					System.out.print("From "+i+" to ");
				}
				else {
					System.out.println(i-1);
				}
			}
		}
		if(arr[n-1]!=arr[0]) {
			System.out.println(n-1);
		}
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
		flip(arr,n);
		sc.close();
	}

}
