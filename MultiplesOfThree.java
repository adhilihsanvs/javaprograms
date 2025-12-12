package NEW;

public class MultiplesOfThree {

	 // User-defined method
    public static void printMultiples(int arr[]) {
		// TODO Auto-generated method stub
    	  int count = 0;

          // Check multiples of 3
          for (int num : arr) {
              if (num % 3 == 0) {
                  count++;
              }
          }

          // Print the count
          System.out.println("Number of elements divisible by 3 = " + count);
      }

      public static void main(String[] args) {

          int[] arr = {3, 10, 21, 14, 18}; // sample array

          // Calling the method
          printMultiples(arr);
      }
  

	}


