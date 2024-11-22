import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = sc.nextDouble();

        System.out.print("Enter the number of months: ");
        int months = sc.nextInt();

        double years = months / 12.0;
        double interestRateDecimal = annualInterestRate / 100.0;

        double totalInterest = principal * interestRateDecimal * years;
        double balance = principal + totalInterest;

        System.out.println("The balance at the end of " + months + " months is: $" + balance);

    }
}
