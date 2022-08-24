import java.util.Scanner;

public class FrequencyOfSortedArray {
	static void frequency(int[] arr,int n) {
		int max=arr[0];
		int cmax=0;
		for(int i=0;i<n;i++) {
			if(max!=arr[i]) {
				System.out.println(max+" "+cmax);
				cmax=0;
			}
			
			if(max<=arr[i]) {
				max=arr[i];
				cmax++;
			}
			if(i==n-1) {
				System.out.println(max+" "+cmax);
			}
		
		}
	}
	
	/*static void frequency(int[] arr,int n) {
		int freq=1,i=1;
		while(i<n) {
			while(i<n && arr[i]==arr[i-1]) {
				freq++;
				i++;
			}
			System.out.println(arr[i-1]+" "+freq);
			freq=1;
			i++;
		}
		if(n==1 || arr[n-1]!=arr[n-2]) {
			System.out.println(arr[n-1]+" "+1);
		}
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
		frequency(arr,n);
		sc.close();
	}

}
