import java.util.Scanner;

public class CountInversionInArray {
	static int countmerge(int[] arr,int low,int mid,int high) {
		int ls=mid-low+1,rs=high-mid;
		int[] l=new int[ls];
		int[] r=new int[rs];
		for(int i=0;i<ls;i++) {
			l[i]=arr[i+low];
		}
		for(int j=0;j<rs;j++) {
			r[j]=arr[j+mid+1];
		}
		int res=0,i=0,j=0,k=low;
		while(i<ls && j<rs) {
			if(l[i]<=r[j]) {
				arr[k++]=l[i];
				i++;
			}
			else {
				arr[k++]=r[j];
				res+=ls-i;
				j++;
			}
		}
		while(i<ls) {
			arr[k++]=l[i++];
		}
		while(j<rs) {
			arr[k++]=r[j++];
		}
		return res;
	}
	static int inversion(int[] arr,int low,int high) {
		int res=0;
		if(high>low) {
			int mid=(low+high)/2;
			res+=inversion(arr,low,mid);
			res+=inversion(arr,mid+1,high);
			res+=countmerge(arr,low,mid,high);
		}
		return res;
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
		System.out.println(inversion(arr,0,n-1));
		sc.close();
	}

}
