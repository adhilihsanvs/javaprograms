package NEW;
import java.math.*;

public class SumofTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix1[][]= {{2,4,5},{5,6,8}};
		int matrix2[][]= {{1,2,3},{4,5,6}};
		int sum[][]= new int[2][3];
		int i=0;
		int j=0;
		for(i=0; i<2; i++) {
			for( j=0; j<3; j++) {
				sum[i][j]= matrix1[i][j]+matrix2[i][j];
			}
			
		}
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
