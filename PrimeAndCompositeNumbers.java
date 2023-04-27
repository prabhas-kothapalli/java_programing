package programs;
import java.util.Scanner;

public class PrimeAndCompositeNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, primeCount = 0, compositeCount = 0;

        System.out.print("Enter a series of numbers (enter 0 to stop): ");
        do {
            num = input.nextInt();
            if (num == 0) {
                break;
            } else if (isPrime(num)) {
                primeCount++;
            } else {
                compositeCount++;
            }
        } while (true);

        System.out.println("Number of prime numbers: " + primeCount);
        System.out.println("Number of composite numbers: " + compositeCount);
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
