package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		
		Queue<String> flavor = new LinkedList<String>();
		flavor.add("Vanilla");
		flavor.add("Chocolate");
		flavor.add("Strawberry");
		flavor.add("Mint");
		
		Iterator<String> fl = flavor.iterator();
		
		while (fl.hasNext()){
			System.out.println(fl.next());}
		
		System.out.println("\n"+"Next use for loop");
		
		for (int i=0; i<=flavor.size()+2; i++){
			System.out.println(flavor.peek());
			System.out.println(flavor.remove());}
		
		
}
	
}
