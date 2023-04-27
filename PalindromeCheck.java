import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int choice;
        String inputString;
        long inputNumber;
        
        System.out.println("Choose an option:");
        System.out.println("1. Check if a string is a palindrome");
        System.out.println("2. Check if a number is a palindrome");
        System.out.print("Enter your choice (1 or 2): ");
        choice = input.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter a string: ");
                inputString = input.next();
                if (isPalindrome(inputString)) {
                    System.out.println(inputString + " is a palindrome.");
                } else {
                    System.out.println(inputString + " is not a palindrome.");
                }
                break;
            case 2:
                System.out.print("Enter a number: ");
                inputNumber = input.nextLong();
                if (isPalindrome(inputNumber)) {
                    System.out.println(inputNumber + " is a palindrome.");
                } else {
                    System.out.println(inputNumber + " is not a palindrome.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    
    public static boolean isPalindrome(String str) {
        String reverseStr = new StringBuilder(str).reverse().toString();
        return str.equals(reverseStr);
    }
    
    public static boolean isPalindrome(long num) {
        long temp = num;
        long reverseNum = 0;
        while (temp != 0) {
            long remainder = temp % 10;
            reverseNum = reverseNum * 10 + remainder;
            temp /= 10;
        }
        return num == reverseNum;
    }

}
