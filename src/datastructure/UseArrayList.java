package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Boy");
		list.add("Cat");
				

		for(String st:list){
		     System.out.println(st);
		    
		}
		
		list.remove(0);
		System.out.println("The list after removing one item:" +list);
		
		
		
		

	}

	}


