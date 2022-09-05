import java.util.Scanner;

public class MissingAndRepeating {
	static void repeatMiss(int[] arr,int n) {
		
	int xor=arr[0],res=0;
	
	for(int i=1;i<n;i++) {
	xor=xor^arr[i];
	}
	for(int i=1;i<=n;i++) {
		xor=xor^i;
	}
	int x=0,y=0;
	res=(xor & ~(xor-1));
	for(int i=0;i<n;i++) {
		if((res&arr[i])!=0) {
			x=x^arr[i];
		}
		else {
			y=y^arr[i];
		}
	}
	 for (int i = 1; i <= n; i++) {
         if ((i & res) != 0)
             x = x ^ i;

         else
             y = y ^ i;
     }
		System.out.println("Repeating Number is "+y+" Missing Number is "+x);
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
		repeatMiss(arr,n);
		sc.close();
	}
	}


