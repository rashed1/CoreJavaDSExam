package datastructure;

import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Apple");
		list.add("Boy");
		list.add("Cat");
				

		for(String st:list){
		     System.out.println(st);}
		
		list.peekFirst();
		System.out.println("The first item in the list is: "+ list.peekFirst());
		
		list.remove(0);
		System.out.println("The list after removing one item:" +list);
		
				
		

	}

}
