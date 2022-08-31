import java.util.Scanner;

public class TripletSorted {
	static boolean isPair(int[] arr,int x,int si) {
		int i=si,j=arr.length-1;
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
	static boolean check(int[] arr,int n,int x) {
		for(int i=0;i<n-2;i++) {
			if(isPair(arr,x-arr[i],i+1)) {
				return true;
			}
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
