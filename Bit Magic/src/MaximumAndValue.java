import java.util.*;
public class MaximumAndValue {
	//Efficient Approach Time Complexity=O(n)
	static int checkPattern(int pattern,int[] arr,int n) {
		int count=0;
		for(int i=0;i<n;i++) {
		 	if((pattern & arr[i])==pattern)
		 			count++;
		}
	return count;
	}
	static int calculateAND(int[] arr,int n) {
		int res=0,count;
		for(int i=31;i>=0;i--) {
			count=checkPattern((res|(1<<i)),arr,n);
			if(count>=2) {
				res=res|(1<<i);
			}
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
		System.out.println(calculateAND(arr,n));
		sc.close();
	}

}
//Naive Approach Time Complexity=O(n^2)
	/*static int calculateAND(int[] arr,int n) {
		int ans=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				ans=Math.max(ans,(arr[i]&arr[j]));
			}// 4  8 12 16
		}
		return ans;
	}*/