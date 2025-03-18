import java.util.Scanner;

public class CurrencyConvertion {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Rupess : ");
        int rupee = s.nextInt();
        Double dollor = rupee * 0.012;
        System.out.print("Dollor Conversion is "+ dollor+"$");
    }

}
