import java.util.*;
class Hash{
	int bucket;
	ArrayList<LinkedList<Integer>> al;
	public Hash(int key) {
	bucket=key;	
	al= new ArrayList<LinkedList<Integer>>();
	for(int i=0;i<bucket;i++)
		al.add(new LinkedList<Integer>());
	}
	void insert(Integer k) {
		int i=k%bucket;
		al.get(i).add(k);
	}
	boolean search(Integer s) {
		int i=s%bucket;
		return al.get(i).contains(s);
	}
	void delete(Integer m) {
		int i=m%bucket;
		al.get(i).remove(m);
	}
}
public class Chaining {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Bucket size");
	int n=sc.nextInt();
	 Hash obj=new Hash(n);
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
