package algorithm;

public class Sort {

	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 */

	//here is selectionsort
    public int[] selectionSort(int [] array){
    	int temp, value,i,k;
        for(i=array.length-1; i>0; i--){
            value = 0;
            for(k = 1; k<=i; k++){
                if(array[k]>array[value])
                    value = k;}
            temp = array[value];
            array[value] = array[i];
            array[i] = temp;}
        return array;
    }
    
    //here is insertionsort
    public int[] insertionSort(int [] array){
        int temp, k;
        for(int c=0; c<array.length; c++){
            temp = array[c];
            for ( k = c-1; k >=0 && temp<array[k]; k--) {
                array[k + 1] = array[k];}   
            array[k+1] = temp;}        
        return array;
    }
    
    //here is bubblesort
    public int[] bubbleSort(int [] array){
    	int temp;
        for(int i=0; i<array.length-1; i++){
            for(int j=1;j<array.length-i; j++){
                if(array[j-1]>array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;}  
            }   
        }  
        return array;
    }
    
    //here is mergesort
    public int [] mergeSort(int [] array){
        int [] list = array;
        divideNumbers(list);
        return list;
    }
    
    public void divideNumbers(int[] array) {
        int [] list = array;
        if(list.length>1){
            int [] left = right(array);
            int [] right = left(array);
            divideNumbers(left);
            divideNumbers(right);
            merge(left, right); }
    }
    
    public int [] left(int [] array){
        int size = array.length/2;
        int [] left = new int[size];
        for(int i=0; i<left.length; i++){
            left[i] = array[i];}
        return left;}
    
    
    public int [] right(int [] array){
        int size = array.length - array.length/2;
        int [] right = new int[size];
        for(int i=0; i<right.length; i++){
            right[i] = array[array.length/2+i];}
        return right;}
    
    public static int[] merge(int[] A, int[] B){
        int result[] = new int[A.length+B.length];
        int idex_A = 0;
        int idex_B = 0;
        int idex_result = 0;
        while(idex_A < A.length || idex_B < B.length){ 
        if(idex_B >= B.length || (idex_A < A.length && A[idex_A] < B[idex_B]))
        result[idex_result++] = A[idex_A++];
        else result[idex_result++] = B[idex_B++];}
        return result;}
        
        

        
    
    //here is quicksort
    public int [] quickSort(int [] array){
        int [] list = array;
        quickSort(0, list.length - 1);
        return list;
    }
    
    public void quickSort(int left, int right){
    	
    	
    }
        

   
    // here is heapSort
    public int [] heapSort(int [] array){
        int [] list = array;
        
        
        

        return list;
    }

    //here is buckert sort
    public int [] bucketSort(int [] array){
        int [] list = array;
        
        
        

        return list;
    }
    
    
    //here is shell sort
    public int [] shellSort(int [] array){
        int [] list = array;
        
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}