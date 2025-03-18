// Formula: SI = (P × R × T) / 100
// Where:
// SI = Simple Interest
// P = Principal amount (initial investment or loan)
// R = Annual interest rate (in percentage)
// T = Time (in years)

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Principal amount : ");
        double pamnt = s.nextDouble();
        System.out.println("Enter the Interest Rate in % : ");
        int percentage = s.nextInt();
        System.out.println("Enter the time in years : ");
        int t = s.nextInt();

        double result = (pamnt*percentage*t)/100;
        System.out.println("Simple Interest is "+ result+ " rs.");
    }
}
