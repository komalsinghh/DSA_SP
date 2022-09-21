import java.util.*;
public class HashSetExamp {

	public static void main(String[] args) {
	HashSet<String> h=new HashSet<>();
	h.add("komal");
	h.add("singh");
	h.add("cool");
	System.out.println(h);
	System.out.println(h.contains("cool"));
	System.out.println(h.size());
	h.remove("cool");
	Iterator<String> it=h.iterator();
	while(it.hasNext()) {
		System.out.print(it.next()+" ");
	}
	//using for each loop
	for(String s:h) {
		System.out.print(s+" ");
	}
	}

}
