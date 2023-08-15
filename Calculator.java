import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the calculator app");
        System.out.println("operations include +, -, *, /");
        System.out.println("choose your first number");

        double num1 = scanner.nextDouble();

        System.out.println("choose your operation");

        char operator = scanner.next().charAt(0);

        System.out.println("choose your second number");

        double num2 = scanner.nextDouble();

        double result = 0.0;

        switch (operator){
            case '+': 
            result = num1 + num2;
            break;
            case '-':
            result = num1 - num2;
            break;
            case '*': 
            result = num1 * num2;
            break;
            case '/': 

            if(num2 != 0){
                result = num1 / num2;
            }else{
                System.out.println("warning cannot divide by zero");
            }
            break;
            default:
            System.out.println("Error: invalid operator");
           
            
        }
        System.out.println("result:" + result);
        scanner.close();

    }
}