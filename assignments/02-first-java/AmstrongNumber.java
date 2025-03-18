import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start number");
        int start = scanner.nextInt();
        System.out.println("Enter the end number");
        int end = scanner.nextInt();
        for (int i = start; i < end; i++) {
            if (isAmstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }

    static boolean isAmstrongNumber(int x) {
        int power = 0;
        if (x == 0) {
            power = 1;
        } else {
            power = (int) Math.log10(x) + 1;
        }
       // Alternate way --> String.valueOf(x).length();
        int sum = 0, x1 = x;

        while (x1 > 0) {
            int rem = x1 % 10;
            sum += (int) Math.pow(rem, power);
            x1 /= 10;
        }
        return (x == sum);
    }

    // Traditional approach
    static int numberOfDigits(int x) {
        int result = 0;
        while (x > 0) {
            result += 1;
            x /= 10;
        }
        return result;
    }
}
