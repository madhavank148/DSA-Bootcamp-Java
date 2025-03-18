import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number one : ");
        int a = s.nextInt();
        System.out.print("Enter Number one : ");
        int b = s.nextInt();

        System.out.println("Greatest of "+ a +",10 " + b +" is "+ ( a >= b ? a : b));

    }
}
