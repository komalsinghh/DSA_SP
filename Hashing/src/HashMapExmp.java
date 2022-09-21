import java.util.*;
public class HashMapExmp {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("komal", 1);
		hm.put("singh", 2);
		hm.put("cutie", 3);
		System.out.println(hm.size());
		System.out.println(hm);
		//print using iterator
		for(Map.Entry<String,Integer> e:hm.entrySet()) {
			System.out.print(e.getKey()+" "+e.getValue());
		}
		System.out.println(hm.containsKey("cuite")); 
		hm.remove("cutie");
		System.out.println(hm.size());
		
	}

}
