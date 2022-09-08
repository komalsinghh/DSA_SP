import java.util.Scanner;

public class UnionOfTwoSortedArrays {
	static void union(int[] a,int n,int[] b,int m) {
		int i=0,j=0;
		while(i<n && j<m) {
			if(i>0 && a[i]==a[i-1]) {
				i++;
				continue;
			}
			if(j>0 && b[j]==b[j-1]) {
				j++;
				continue;
			}
			if(a[i]<b[j]) {
				System.out.print(a[i]+" ");
				i++;
			}
			else if(a[i]>b[j]) {
				System.out.print(b[j]+" ");
				j++;
			}
			else {
				System.out.print(a[i]+" ");
				i++;j++;
			}
		}
		while(i<n) {
			if(i==0 || a[i]!=a[i-1]) {
			System.out.print(a[i]+" ");
			i++;
			}
			}
		while(j<m) {
			if(j==0 || b[j]!=b[j-1]) {
			System.out.print(b[j]+" ");
			j++;
			}
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
		System.out.println("Enter size of an array");
		int m=sc.nextInt();
		int[] a=new int[m];
		System.out.println("Enter elements");
		for(int i=0;i<m;i++) {
			a[i]=sc.nextInt();
		}
		union(arr,n,a,m);
		sc.close();
	}

}
