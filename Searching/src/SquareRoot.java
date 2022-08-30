import java.util.Scanner;

public class SquareRoot {
	//Efficient Approach
	static int check(int x) {
		int low=1,high=x,ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			int sqr=mid*mid;
			if(sqr==x) {
				return mid;
			}
			else if(sqr>x) {
				high=mid-1;
			}
			else {
				low=mid+1;
				ans=mid;
			}
		}
		return ans;
	}
	
	//Naive Approach(O(sqrt(x))
	/*
	static int check(int[] arr,int n,int x) {
		int i=1;
		while(i*i<=x) {
			i++;
		}
		return i-1;
	}
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to find square root");
		int x=sc.nextInt();
		System.out.println(check(x));
		sc.close();
	}

}
