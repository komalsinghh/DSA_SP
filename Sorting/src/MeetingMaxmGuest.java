import java.util.Arrays;
import java.util.Scanner;

public class MeetingMaxmGuest {
	static int meeting(int[] arr,int[] dep,int n) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i=1,j=0,res=1,curr=1; // i=1 because it's obvious arrival is less than departure
		while(i<n && j<n) {
			if(arr[i]<dep[j]) {
				i++;
				curr++;
			}
			else {
				j++;
				curr--;
			}
			res=Math.max(res, curr);
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Arrival");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] dep=new int[n];
		System.out.println("Enter Departure");
		for(int i=0;i<n;i++) {
			dep[i]=sc.nextInt();
		}
		System.out.println(meeting(arr,dep,n));
		sc.close();
	}

}
