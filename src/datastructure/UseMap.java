package datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Rashed
 *
 */
public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Map<String,String> flavor = new HashMap<String,String>();
		flavor.put("Flavor1", "Vanilla");
		flavor.put("Flavor2", "Chocolate");
		flavor.put("Flavor3", "Strawberry");
		
		
		for(Map.Entry<String,String> st:flavor.entrySet()){
			System.out.println(st.getKey()+" is "+st.getValue());
		}
				
		Iterator<Map.Entry<String,String>> it = flavor.entrySet().iterator();
		
		while (it.hasNext()){
			System.out.println(it.next());
		
	}
	}

}
