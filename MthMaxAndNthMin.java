package programs;
import java.util.Arrays;
import java.util.Scanner;

public class MthMaxAndNthMin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = {1, 4, 7, 2, 9, 5, 3, 8, 6};  // example array
        System.out.println("Array: " + Arrays.toString(arr));

        System.out.print("Enter the value of M: ");
        int m = input.nextInt();
        System.out.print("Enter the value of N: ");
        int n = input.nextInt();

        Arrays.sort(arr);
        int mthMax = arr[arr.length - m];
        int nthMin = arr[n - 1];
        int sum = mthMax + nthMin;
        int diff = mthMax - nthMin;

        System.out.println("Mth maximum number: " + mthMax);
        System.out.println("Nth minimum number: " + nthMin);
        System.out.println("Sum of Mth maximum and Nth minimum: " + sum);
        System.out.println("Difference between Mth maximum and Nth minimum: " + diff);
    }

}
