package programs;
import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade of the employee: ");
        String grade = scanner.nextLine();

        System.out.print("Enter the employee salary: ");
        double salary = scanner.nextDouble();

        double bonusPercentage;
        if (grade.equalsIgnoreCase("A")) {
            bonusPercentage = 0.05;
        } else {
            bonusPercentage = 0.1;
        }

        if (salary < 10000) {
            bonusPercentage += 0.02;
        }

        double bonus = salary * bonusPercentage;
        double totalSalary = salary + bonus;

        System.out.println("Salary=" + salary);
        System.out.println("Bonus=" + bonus);
        System.out.println("Total to be paid:" + totalSalary);
    }
}

