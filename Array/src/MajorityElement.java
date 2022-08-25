import java.util.Scanner;

public class MajorityElement {
	static int majorityele(int[] arr,int n) {
	//Moore's Voting Algo
		int res=0,count=1;
		for(int i=1;i<n;i++) {
			if(arr[i]==arr[res]) {
				count++;
			}
			else {
				count--;
			}
			if(count==0) {
				res=i;
				count=1;
			}
		}
		count=0;
		for(int i=0;i<n;i++) {
			if(arr[res]==arr[i]) {
				count++;
			}
		}
		if(count<= n/2) {
			res=-1;
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
		int res=majorityele(arr,n);
		System.out.println(res);
		sc.close();

	}

}
