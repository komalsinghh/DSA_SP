import java.util.Scanner;

public class CycleSort {
	static void cycle(int[] arr,int n) {
		int count=0;
		 for(int cs=0;cs<n-1;cs++){
	            int item=arr[cs];
	            int pos=cs;
	            for(int i=cs+1;i<n;i++)
	                if(arr[i]<item)
	                    pos++;
	            //swap(item,arr[pos])
	            
	            int temp=item;
	            item=arr[pos];
	            arr[pos]=temp;
	            if(pos!=cs) {
	            	count++;
	            }
	            while(pos!=cs){
	                pos=cs;
	                for(int i=cs+1;i<n;i++)
	                    if(arr[i]<item)
	                        pos++;
	                        
	                //swap(item,arr[pos])
	                temp=item;
	                item=arr[pos];
	                arr[pos]=temp;
	                if(pos!=cs) {
		            	count++;
		            }
	               
	            }
	        }
		 System.out.println("Swap Occures "+count);
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
		cycle(arr,n);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
