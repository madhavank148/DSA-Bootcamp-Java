import java.util.Scanner;

public class FibanacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number upto Fibanacci Serires: ");
        int number = scanner.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first +", "+ second);
        for (int i = 2; i < number; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
        // if we want to find the sum upto that number...
        scanner.close();
    }

    int fibanacci(int n){ // F(n) => F(n-1)+F(n-2)
         if (n <= 1) {
            return n;
         }
         int first = 0, second=1, result=0;
         for(int i=2; i<=n; i++){
            result = first+second;
            first = second;
            second = result;
         }
         return result;
    }
}
