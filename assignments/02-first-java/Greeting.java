import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name = s.next(); // until space it accept the input
        System.out.println("Welcome "+ name);
    }
}
