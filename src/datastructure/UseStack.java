package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		
		Stack<String> flavor = new Stack<String>();
		flavor.push("Vanilla");
		flavor.push("Chocolate");
		flavor.push("Strawberry");
		flavor.push("Mint");
		
		Iterator<String> it = flavor.iterator();
		
		while (it.hasNext()){
			System.out.println(it.next());
			}
		
		System.out.println("\n"+"Next use for loop");
		
		for (int i=0; i<=flavor.size()+2; i++){
			System.out.println(flavor.pop());}
		
//		for (int i=0; i<=flavor.size()+2; i++){
//			System.out.println(flavor.peek());}
		
//		System.out.println(flavor.remove(1));
		
		

		
		
	}

}
