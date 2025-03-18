import java.util.Scanner;

public class NumbersAndOperation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number One: ");
        int a = s.nextInt();

        System.out.print("Enter the Number Two: ");
        int b = s.nextInt();

        System.out.print("Enter the Operation to Perform (+, -, *, /): ");
        char x = s.next().charAt(0); // Read operation as a character

        int res = 0;
        boolean validOperation = true;

        switch (x) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                } else {
                    res = a / b;
                }
                break;
            default:
                System.out.println("Please Enter a Valid Operation (+, -, *, /)");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Result is: " + res);
        }

        s.close(); // Close the scanner
    }
}