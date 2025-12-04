package NEW;

public class MethodDmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean value = MethodDmo.canVote(20);
		if (value)
			System.out.println("canVote");
		else
			System.out.println("cannot vote");
	}
	public static boolean canVote(int age) {
		
		if (age>18) {
			return true;
		}
		else {
			return false;
		}
		
		

	}

}
