package NEW;
import java.util.Scanner;
public class returntrueorfalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A:");
		System.out.println("Enter B:");
		int b= sc.nextInt();
		
		int a = 0;
		boolean result = (a == 6 || b == 6 ||(a+b) == 6 || Math.abs(a-b) == 6);
		System.out.println(result);
		
			
		

	}

}
