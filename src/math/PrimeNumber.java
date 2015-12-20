package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 * 
		 */
		
		int numberToCheck = 1000000;
        int numberOfPrimeSofar = 0;
        boolean isPrime = true;
        for(int i=2; i<=numberToCheck; i++){
             isPrime = true;
             for(int j=2; j<=i/2; j++){
                 if(i % j == 0){
                     j = i;
                     isPrime = false;
                 }
             }
            if(isPrime){
                System.out.println(i);
                numberOfPrimeSofar++;
            }
        }
        System.out.println("Number Of Prime Numbers So Far: " + numberOfPrimeSofar);
    }
}

