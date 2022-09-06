import java.util.Scanner;

public class Merge2SortedArrays {
	static void mergetwo(int[] a,int m,int[] b,int n) {
		 int i=0,j=0;
	        while(i<m && j<n){
	            if(a[i]<b[j])
	                System.out.print(a[i++]+" ");
	            else
	                System.out.print(b[j++]+" ");
	        }
	        while(i<m)
	            System.out.print(a[i++]+" ");
	        while(j<n)
	            System.out.print(b[j++]+" ");   
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
		System.out.println("Enter size of an array");
		int m=sc.nextInt();
		int[] a=new int[m];
		System.out.println("Enter elements");
		for(int i=0;i<m;i++) {
			a[i]=sc.nextInt();
		}
		mergetwo(arr,n,a,m);
		sc.close();
	}

}
