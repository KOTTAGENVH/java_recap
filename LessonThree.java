import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for an initial total
        System.out.println("Enter the initial total:");
        double total = scanner.nextDouble();
        
        while (true) {
            System.out.println("Please enter an operator (+, -, *, /) or type 'exit' to quit:");
            String operatorInput = scanner.next();
            
            // Check if the user wants to exit
            if (operatorInput.equalsIgnoreCase("exit")) {
                break;
            }
            
            // Validate that the operator is one of the expected symbols
            if (operatorInput.length() != 1 || "+-*/".indexOf(operatorInput.charAt(0)) == -1) {
                System.out.println("Invalid operator. Try again.");
                continue;
            }
            
            char operator = operatorInput.charAt(0);
            
            // Ask user for a number to operate with
            System.out.println("Please enter a number:");
            double number = scanner.nextDouble();
            
            // Perform the corresponding operation
            switch (operator) {
                case '+':
                    total += number;
                    break;
                case '-':
                    total -= number;
                    break;
                case '*':
                    total *= number;
                    break;
                case '/':
                    if (number != 0) {
                        total /= number;
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
            }
            
            System.out.println("Total is now: " + total);
        }
        
        System.out.println("Final total is: " + total);
        scanner.close();
    }
}
