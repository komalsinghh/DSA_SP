import java.util.Scanner;
//Using Dutch National Flag
public class Segregate0s1s2s {
	static void dutch(int[] arr,int n) {
		int low=0,high=n-1,mid=0;
		while(mid<=high) {
			if(arr[mid]==0) {
				int temp=arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				low++;
				mid++;
			}
			else if(arr[mid]==1) {
				mid++;
			}
			else {
				int temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
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
		dutch(arr,n);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
