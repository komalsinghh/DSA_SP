import java.util.Scanner;

public class MaxmLengthEvenOdd {
	static int lengthEvenOdd(int[] arr,int n) {
		int count=1;
		for(int i=0;i<n-1;i++) {
			if(((arr[i]%2==0) && arr[i+1]%2!=0) || ((arr[i]%2!=0) && (arr[i+1]%2==0))) {
				count++;
			}
			else
				count=1;
		}
		return count;
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
		int res=lengthEvenOdd(arr,n);
		System.out.println(res);
		sc.close();
	}

}
