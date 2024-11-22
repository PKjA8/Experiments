import java.util.Scanner;

public class MovieTheater_Profit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of attendees: ");
        int attendees = sc.nextInt();

        int ticketPrice = 5;
        int fixedCost = 20;
        double variableCostPerAttendee = 0.50;

        int income = attendees * ticketPrice;
        double totalCost = fixedCost + (variableCostPerAttendee * attendees);
        double profit = income - totalCost;

        System.out.println("Income from tickets: $" + income);
        System.out.println("Total costs: $" + totalCost);
        System.out.println("Total profit: $" + profit);

    }
}
