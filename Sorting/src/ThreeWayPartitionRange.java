import java.util.Scanner;

public class ThreeWayPartitionRange {
	static void dutch(int[] arr,int n,int lowVal,int highVal) {
		int l=0,h=n-1;
		for(int i=0;i<=h;i++) {
			if(arr[i]<lowVal) {
				int temp=arr[l];
				arr[l]=arr[i];
				arr[i]=temp;
				l++;
			}
			else if(arr[i]>highVal) {
				int temp=arr[h];
				arr[h]=arr[i];
				arr[i]=temp;
				h--;
				i--;
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
		System.out.println("Enter Range");
		int l=sc.nextInt();
		int h=sc.nextInt();
		dutch(arr,n,l,h);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
