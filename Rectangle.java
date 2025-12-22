package com.acharya;

public class Rectangle {
	   // Member variables for dimensions
    double width;
    double height;

    /**
     * Enum to represent specific color constants
     */
    enum Color {
        RED, GREEN, BLUE
    }

    // Member variable to store the color of the rectangle
    Color boxColor;

    /**
     * Main method: The entry point of the program
     */
    public static void main(String[] args) {

        // Requirement: Print the enum Color.BLUE
        // Java's default toString() for enums prints the name of the constant
        System.out.println(Color.BLUE);
    }
}


