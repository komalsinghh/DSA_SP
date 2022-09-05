import java.util.Scanner;

public class WaterBetnTwoBuildings {
	static int trapping(int[] arr,int n) {
		int area=0,maxarea=0,low=0,high=n-1;
		while(low<high) {
			area=Math.min(arr[low], arr[high])*(high-low-1);
			if(area>maxarea) {
				maxarea=area;
			}
			if(Math.min(low, high)==arr[low]) {
				low++;
			}
			else {
				high--;
			}
		}
		return maxarea;
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
		System.out.println(trapping(arr,n));
		sc.close();
	}

}
/*
Given an integer array representing the heights of N buildings, the task is to delete N-2 buildings such that the water that can be trapped
 between the remaining two building is maximum.
Note: The total water trapped between two buildings is gap between them (number of buildings removed) multiplied by height of the smaller 
building.

Example 1:

Input:
N = 6
height[] = {2,1,3,4,6,5}
Output: 8
Explanation: The heights are 2 1 3 4 6 5.
So we choose the following buildings
2,5  and remove others. Now gap between 
two buildings is equal to 4, and the
height of smaller one is 2. So answer is
2 * gap = 2*4 = 8. There is
no answer greater than this.
Example 2:

Input:
N = 2
height[] = {2,1}
Output: 0
Explanation: The heights are 2 1.
But there is no other buildings to be 
removed so total removed= 0.  
Now the height of smaller one is 2.
So answer is 2 * removed buildings = 2*0
= 0.
*/