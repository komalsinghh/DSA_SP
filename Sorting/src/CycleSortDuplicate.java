import java.util.Arrays;
import java.util.Scanner;

public class CycleSortDuplicate {
	//this basically for number from 0-n or 1-n then use this
	static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void duplicatecycle(int[] arr,int n) {
		int i=0;
		while(i<n) {
			int index=arr[i]-1;
			if(arr[index]!=arr[i]) {
				swap(arr,index,i);
			}
			else {
				i++;
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
		duplicatecycle(arr,n);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
