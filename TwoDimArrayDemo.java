package NEW;
import java.util.*;

public class TwoDimArrayDemo {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int arr[][]=new int[2][3];
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.println("enter the value for row" +(i+1)+" and column"+(j+1));
					arr[i][j] = sc.nextInt();
					
				}
			}
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.println(arr[i][j]+"");
				}
				System.out.println();
			}
		}

	}

}
