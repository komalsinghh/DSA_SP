import java.util.Scanner;

public class MedianTwoSortedArrays {
	static double findMedian(int a1[], int a2[], int n1, int n2)
	{
		int begin1 = 0, end1 = n1;

		while(begin1 < end1)
		{
			int i1 = (begin1 + end1) / 2;
			int i2 = ((n1 + n2 + 1) / 2 )- i1;

			int min1 = (i1 == n1)?Integer.MAX_VALUE:a1[i1];
			int max1 = (i1 == 0)?Integer.MIN_VALUE:a1[i1 - 1];
			
			int min2 = (i2 == n2)?Integer.MAX_VALUE:a2[i2];
			int max2 = (i2 == 0)?Integer.MIN_VALUE:a2[i2 - 1];

			if(max1 <= min2 && max2 <= min1)
			{
				if((n1 + n2) % 2 == 0)
					return ((double)Math.max(max1, max2) + Math.min(min1, min2)) / 2;
				else
					return (double) Math.max(max1, max2);
			}
			else if(max1 > min2)
				end1 = i1 - 1;
			else 
				begin1 = i1 + 1;
		}
		
		return -1;
	}
	/*
	static double findMedian(int[] a1,int[] a2,int n,int m) {
		int begin=0,end=n-1;
		while(begin<end) {
			int i1=(begin+end)/2;
			int i2=((n+m+1)/2)-i1;
			int min1 = (i1 == n)?Integer.MAX_VALUE:a1[i1];
			int max1 = (i1 == 0)?Integer.MIN_VALUE:a1[i1 - 1];
			
			int min2 = (i2 == m)?Integer.MAX_VALUE:a2[i2];
			int max2 = (i2 == 0)?Integer.MIN_VALUE:a2[i2 - 1];
			
			if(max1<=min2 && max2<=min1) {
				if((n+m)%2==0) {
					return ((double)Math.max(max1, max2)+Math.min(min1, min2))/2;
				}
				else
					return (double)Math.max(max1, max2);
			}
			else if(max1>min2) {
				end=i1-1;
			}
			else {
				begin=i1+1;
			}
		}
		return -1;
	}
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int[] a1=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter size of 2nd array");
		int m=sc.nextInt();
		int[] a2=new int[m];
		System.out.println("Enter elements");
		for(int i=0;i<m;i++) {
			a2[i]=sc.nextInt();
		}
		System.out.println(findMedian(a1,a2,n,m));
		sc.close();
	}

}
