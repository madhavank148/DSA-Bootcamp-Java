
import java.util.Scanner;
public class InputTillx {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to sum (type 'x' to exit):");

        while (true) {
            if (s.hasNextInt()) { // Check if the next input is an integer
                int num = s.nextInt(); // Read the integer
                sum += num;
            } else {
                String input = s.next(); // Read non-integer input
                if (input.equalsIgnoreCase("x")) {
                    break; // Exit loop if 'x' is entered
                } else {
                    System.out.println("Invalid input! Please enter a number or 'x' to exit.");
                }
            }
        }

        System.out.println("Sum of all entered numbers: " + sum);
        s.close(); // Close scanner
    }
}
