import java.util.Scanner;
import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        float first = sc.nextFloat();
        System.out.print("Enter second Number: ");
        float second = sc.nextFloat(); 
        // Method 1 - swapping using a third/temporary variable
        System.out.println("Using Temporary Variable: ");
        System.out.println("Before Swapping Numbers, first number = " + first + " and second number = " + second);
        float temp = first;
        first = second;
        second = temp;
        System.out.println("After Swapping Numbers, first number = " + first + " and second number = " + second); 

        // Method 2 - swapping using arithmetic operators
        System.out.println("Using Arithmetic Operators: ");
        System.out.println("Before Swapping Numbers, first number = " + first + " and second number = " + second);
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println("After Swapping Numbers, first number = " + first + " and second number = " + second); 

        // Method 3 - using bitwise XOR
        System.out.println("Using Bitwise XOR: ");
        System.out.println("Before Swapping Numbers, first number = " + first + " and second number = " + second);
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println("After Swapping Numbers, first number = " + first + " and second number = " + second);

        // Method 4 - using mutltiplication and division
        System.out.println("Using Mutltiplication & Division: ");
        System.out.println("Before Swapping Numbers, first number = " + first + " and second number = " + second);
        first = first * second;
        second = first / second;
        first = first / second;
        System.out.println("After Swapping Numbers, first number = " + first + " and second number = " + second);
    }
}
