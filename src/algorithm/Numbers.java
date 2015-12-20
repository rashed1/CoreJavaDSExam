package algorithm;
import java.util.Random;


public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm use by applying into (num array). 
	 * Display the execution time for each sorting. 
	 */

	public static void main(String[] args) {
		
		final long startTime = System.currentTimeMillis();
		
		int [] num = new int[10000];
		
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			
		num[i] = rand.nextInt(1000000);
			
		}

		//Example for Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		
//		System.out.println("...............after selection sorting............");
		for(int i=0; i<num.length; i++){
			
//			System.out.println(num[i]);
				
			}

		final long endTime = System.currentTimeMillis();
		final long executionTime = endTime - startTime;
		System.out.println("Total Execution Time for selection sort : " + executionTime + " milli sec");
		
		//Example for Insertion Sort
		final long startTime2 = System.currentTimeMillis();
		
		Sort algo2 = new Sort();
		algo2.insertionSort(num);
		
//		System.out.println("...............after insertion sorting............");
		for(int i=0; i<num.length; i++){
			
			System.out.println(num[i]);
				
			}

		final long endTime2 = System.currentTimeMillis();
		final long executionTime2 = endTime2 - startTime2;
		System.out.println("Total Execution Time for insertion sort : " + executionTime2 + " milli sec");
		
		//Example for bubble Sort
		final long startTime3 = System.currentTimeMillis();
		Sort algo3 = new Sort();
		algo3.bubbleSort(num);
		
		System.out.println("...............after sorting............");
		for(int i=0; i<num.length; i++){
			
			System.out.println(num[i]);
				
			}

		final long endTime3 = System.currentTimeMillis();
		final long executionTime3 = endTime3 - startTime3;
		System.out.println("Total Execution Time for bubble sort : " + executionTime3 + " milli sec");
		
		//Example for merge Sort
		
		final long startTime4 = System.currentTimeMillis();
		Sort algo4 = new Sort();
		algo4.mergeSort(num);
		
		
//		System.out.println("...............after sorting............");
		for(int i=0; i<num.length; i++){
			
			System.out.println(num[i]);
				
			}

		final long endTime4 = System.currentTimeMillis();
		final long executionTime4 = endTime4 - startTime4;
		System.out.println("Total Execution Time for merge sort: " + executionTime4 + " milli sec");
	}

}
