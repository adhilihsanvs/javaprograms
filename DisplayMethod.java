package NEW;

public class DisplayMethod {

	 // display method with int parameter
    void display(int num) {
        System.out.println("Integer value: " + num);
    }

    // display method with char parameter
    void display(char ch) {
        System.out.println("Character value: " + ch);
    }

    // display method with String parameter
    void display(String str) {
        System.out.println("String value: " + str);
    }

    public static void main(String[] args) {

        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        obj.display(100);
        obj.display('A');
        obj.display("Java Programming");
    }

	}


