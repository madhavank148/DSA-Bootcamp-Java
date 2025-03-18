import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check Odd or Even : ");
        int x = in.nextInt();
        // Using If-Else Block
        if (x%2 == 0) {
            System.out.println( x + " is Even");
        } else
        {
            System.out.println( x + " is Odd");
        }

        // Using Ternery operator
        System.out.println("Given num " + x + " is " + (x % 2 == 0 ? "Even" : "Odd"));
    } 
}
