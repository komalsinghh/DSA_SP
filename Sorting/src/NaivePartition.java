import java.util.Scanner;

public class NaivePartition {
	static void partition(int arr[], int l, int h, int p)
    {
        int[] temp=new int[h-l+1];int index=0;
        for(int i=l;i<=h;i++)
            if(arr[i]<=arr[p] && i!= p)
                {
                    temp[index]=arr[i];index++;
                }
        temp[index++] = arr[p];
        for(int i=l;i<=h;i++)
            if(arr[i]>arr[p])
                {
                    temp[index]=arr[i];index++;
                }
        for(int i=l;i<=h;i++)
            arr[i]=temp[i-l];
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
		System.out.println("Enter Pivot");
		int p=sc.nextInt();
		partition(arr,0,n-1,p);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
