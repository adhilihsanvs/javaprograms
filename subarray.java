package NEW;

public class subarray{

    // Method to return subarray
    public static int[] subArray(int[] arr, int start, int end) {
        // Size of the subarray
        int size = end - start + 1;
        int[] result = new int[size];

        int index = 0;
        for (int i = start; i <= end; i++) {
            result[index] = arr[i];
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        int start = 2;  // Example: start index
        int end = 4;    // Example: end index

        int[] result = subArray(arr, start, end);

        System.out.print("Subarray: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}


