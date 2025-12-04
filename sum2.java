package NEW;

public class sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {5,10,15,20,25};
		
		int sum = findsum(numbers);
		
		System.out.println("Sum of array elements:" +sum);
	}
	public static int findsum(int[] arr) {
		int total=0;
		 
		for (int num : arr) {
			total +=num;
		}
		return total;

	
		

	}

}
