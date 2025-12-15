package NEW;

public class MethodOverloadingDemo {

	    // Method with no parameters
	    void display() {
	        System.out.println("Display method with no parameters");
	    }

	    // Method with one int parameter
	    void display(int a) {
	        System.out.println("Display method with one integer: " + a);
	    }

	    // Method with two int parameters
	    void display(int a, int b) {
	        System.out.println("Display method with two integers: " + a + " and " + b);
	    }

	    // Method with String parameter
	    void display(String name) {
	        System.out.println("Display method with String parameter: " + name);
	    }

	    public static void main(String[] args) {

	        MethodOverloadingDemo obj = new MethodOverloadingDemo();

	        obj.display();
	        obj.display(10);
	        obj.display(20, 30);
	        obj.display("Java Method Overloading");
	    }
	}

	


