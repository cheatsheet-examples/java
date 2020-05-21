import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even number");
        } else {
            System.out.println("The number is odd number");
        }

        // The Ternary Operator
        System.out.println(" The number is " + (number % 2 == 0 ? "even" : "odd") + " number");
    }
}