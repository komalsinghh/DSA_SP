import java.util.Scanner;

public class TwoPointer {
	static boolean check(int[] arr,int n,int x) {
		int i=0,j=n-1;
		while(i<j) {
			if(arr[i]+arr[j]==x) {
				return true;
			}
			else if(arr[i]+arr[j]>x) 
				j--;
			
			else
				i++;
		}
		return false;
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
		System.out.println("Enter Sum");
		int x=sc.nextInt();
		System.out.println(check(arr,n,x));
		sc.close();
	}

}
