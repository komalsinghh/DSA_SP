import java.util.Scanner;

public class BubbleSort {
	//Optimised Bubble sort
	static void bubble(int[] arr,int n) {
		boolean swapped=false;
		for(int i=0;i<n-1;i++) {
			swapped=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(swapped==false)
				break;
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
		bubble(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	

	}

}
