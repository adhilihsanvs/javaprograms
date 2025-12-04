package NEW;

import java.util.Scanner;

public class SumofFournumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter four numbers:");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int d =sc.nextInt();
		
		int sum = a+b+c+d;
		System.out.println("Sum of four numbers is:" + sum);

	}

}
