import java.util.Scanner;
//Segregate positive and negative
public class SortArrayWith2Types {
	static void hoares(int[] arr,int n) {
		int i=-1,j=n;
		while(true)
        {
            do{i++;}while(arr[i]<0);
            do{j--;}while(arr[j]>=0);
            if(i>=j)return;
            
            //swapping arr[i] & arr[j]
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
		hoares(arr,n);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
