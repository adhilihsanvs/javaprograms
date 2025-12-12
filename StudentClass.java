package NEW;

public class StudentClass {

		// TODO Auto-generated method stub
		  int id;
		    String firstName;
		    String lastName;
		    double fees;

		    // Parameterized constructor
		    void Student(int id, String firstName, String lastName, double fees) {
		        this.id = id;
		        this.firstName = firstName;
		        this.lastName = lastName;
		        this.fees = fees;
		    }

		    // Method to return full name
		    String getName() {
		        return firstName + " " + lastName;
		    }

		    // Method to return fees
		    double getFees() {
		        return fees;
		    }
		}

		public class StudentClass {
		    public static void main(String[] args) {

		        // Creating 3 Student objects
		        Student s1 = new Student(101, "Rahul", "Sharma", 25000.50);
		        Student s2 = new Student(102, "Anita", "Kumar", 30000.00);
		        Student s3 = new Student(103, "John", "Paul", 28000.75);

		        // Printing the values
		        System.out.println("Student 1: ID = " + s1.id + ", Name = " + s1.getName() + ", Fees = " + s1.getFees());
		        System.out.println("Student 2: ID = " + s2.id + ", Name = " + s2.getName() + ", Fees = " + s2.getFees());
		        System.out.println("Student 3: ID = " + s3.id + ", Name = " + s3.getName() + ", Fees = " + s3.getFees());
		    }
		
	}


