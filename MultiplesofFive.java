package NEW;

public class MultiplesofFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {10, 22, 35, 47, 55};  // sample array
	        int count = 0;

	        // Check multiples of 5
	        for (int num : arr) {
	            if (num % 5 == 0) {
	                count++;
	            }
	        }

	        // Print the count
	        System.out.println("Number of elements divisible by 5: " + count);
	    }


	}


