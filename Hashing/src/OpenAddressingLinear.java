import java.util.Scanner;
class Hash1{
	int[] arr;
	int cap,size;
	Hash1(int k){
		cap=k;
		size=0;
		arr=new int[cap];
		for(int i=0;i<cap;i++) {
			arr[i]=-1;
		}
	}
	int hash(int k) {
		return k%cap;
	}
	boolean insert(int key) {
		if(size==cap)
			return false;
		int i=hash(key);
		while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key)
			i=(i+1)%cap;
		if(arr[i]==key)
			return false;
		else {
			arr[i]=key;
			size++;
			return true;
		}
		
	}
	boolean search(int key) {
	int h=hash(key);
	int i=h;
	while(arr[i]!=-1) {
		if(arr[i]==key)
			return true;
		i=(i+1)%cap;
		if(i==h)
			return false;
	}
	return false;
	}
	boolean delete(int key) {
		int h=hash(key);
		int i=h;
		while(arr[i]!=-1) {
			if(arr[i]==key) {
				arr[i]=-2;
				return true;
			}
			i=(i+1)%cap;
			if(i==h)
				return false;
		}
		return false;
	}
}
public class OpenAddressingLinear {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Bucket size");
			int n=sc.nextInt();
			 Hash1 obj=new Hash1(n);
			 System.out.println("Enter no. of data to insert");
			 int d=sc.nextInt();
			 System.out.println("Enter Data");
			 while(d-- >0) {
				 int in=sc.nextInt();
				 obj.insert(in);
			 }
			 System.out.println("Enter no to search");
			 int s=sc.nextInt();
			 System.out.println(obj.search(s));
			 System.out.println("Enter no to delete");
			 int m=sc.nextInt();
			 obj.delete(m);
			 System.out.println(obj.search(m));
			sc.close();
	}

}
