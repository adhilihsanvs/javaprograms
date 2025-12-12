package NEW;

public class BubbleSort {

	 // Bubble sort method
	public static void bubbleSort(int arr[]) {
		// TODO Auto-generated method stub
		int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 9};

        // Calling bubble sort method
        bubbleSort(arr);
    }


	}


