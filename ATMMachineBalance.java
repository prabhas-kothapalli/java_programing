import java.util.Scanner;

public class ATMMachineBalance {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] denominations = {2000, 500, 200, 100};
        int[] notes = new int[4];
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter number of " + denominations[i] + " notes: ");
            notes[i] = input.nextInt();
        }
        
        System.out.print("Enter denomination priority (1-4): ");
        int priority = input.nextInt();
        int balance = calculateBalance(denominations, notes, priority);
        
        System.out.println("Total amount available in ATM machine: " + balance);
    }
    
    public static int calculateBalance(int[] denominations, int[] notes, int priority) {
        int balance = 0;
        for (int i = priority-1; i < 4; i++) {
            balance += denominations[i] * notes[i];
        }
        return balance;
    }

}
