import java.util.Scanner;

public class DecimalToBinaryAndOctal {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int decimalNum;
        
        System.out.print("Enter a decimal number: ");
        decimalNum = input.nextInt();
        
        System.out.println("Binary equivalent: " + decimalToBinary(decimalNum));
        System.out.println("Octal equivalent: " + decimalToOctal(decimalNum));
    }
    
    public static String decimalToBinary(int decimalNum) {
        String binaryNum = "";
        while (decimalNum > 0) {
            int remainder = decimalNum % 2;
            binaryNum = remainder + binaryNum;
            decimalNum /= 2;
        }
        return binaryNum;
    }
    
    public static String decimalToOctal(int decimalNum) {
        String octalNum = "";
        while (decimalNum > 0) {
            int remainder = decimalNum % 8;
            octalNum = remainder + octalNum;
            decimalNum /= 8;
        }
        return octalNum;
    }

}
