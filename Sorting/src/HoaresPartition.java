import java.util.Scanner;

public class HoaresPartition {
	static int lomuto(int[] arr,int l,int h) {
		 int pivot=arr[l];
	        int i=l-1,j=h+1;
	        while(true){
	            do{
	                i++;
	            }while(arr[i]<pivot);
	            do{
	                j--;
	            }while(arr[j]>pivot);
	            if(i>=j)return j;
	            int temp=arr[i];
	            arr[i]=arr[j];
	            arr[j]=temp;
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
		System.out.println(lomuto(arr,0,n-1));
		
		sc.close();
	}

}
