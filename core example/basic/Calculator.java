import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("Please enter operation");
        String operation = scanner.next();

        System.out.println("please enter the second number");
        int num2 = scanner.nextInt();
        int output = 0;
        switch (operation.toCharArray()[0]) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output =num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            default:
                System.out.println("Illigal Operation");
        }
        System.out.println("The answer is : " + output);
    }
}