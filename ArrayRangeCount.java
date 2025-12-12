import java.util.Scanner;
package NEW;

public class ArrayRangeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Enter 9 values for the 3x3 array:");

        // Taking input from the user
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int count1to50 = 0;
        int count50to100 = 0;
        int countAbove100 = 0;

        // Checking the ranges
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                int value = arr[i][j];

                if (value >= 1 && value <= 50) {
                    count1to50++;
                } else if (value > 50 && value <= 100) {
                    count50to100++;
                } else if (value > 100) {
                    countAbove100++;
                }
            }
        }

        // Printing the results
        System.out.println("In the above array there are " + count1to50 + " numbers between 1 to 50");
        System.out.println("In the above array there are " + count50to100 + " numbers between 50 to 100");
        System.out.println("In the above array there are " + countAbove100 + " numbers above 100");
    }


	}


