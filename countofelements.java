package NEW;

public class countofelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,5,5,5,7,7,9};
		
		int count = 0;
		
		for (int i=0; i<arr.length - 1; i++) {
			if (arr[i] == arr[i+1]) {
				count++;
				
			}
		}
		System.out.println("count of same side-by-side elements:" +count);

	}

}
