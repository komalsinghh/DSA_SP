import java.util.Scanner;

public class MoveZeros2End {
	static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void zero(int[] arr,int n) {
	int res=0;
	for(int i=0;i<n;i++) {
		if(arr[i]!=0) {
			swap(arr,i,res);
			res++;
		}
	}
	
	}	
	/*Mine Approach
	static void zero(int[] arr,int n) {
		int res=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[res++]=arr[i];
			}
		}
		for(int i=res;i<n;i++) {
			arr[i]=0;
		}*/
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		zero(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
