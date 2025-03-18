import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ener the String to check the Palindrome or not ");
        String str = scanner.next();
        boolean isPalindrome = true;
        for(int i=0, j=str.length()-1; i<=j ; i++,j--)
             {  if (str.charAt(i) != str.charAt(j)){
                isPalindrome= false;
                break;
               }
            }
            System.err.println(isPalindrome);
        scanner.close();
    }
}
