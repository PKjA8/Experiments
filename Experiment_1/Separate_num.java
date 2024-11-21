import java.util.Scanner;

public class Separate_num {
    public static void main(String [] arg){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        if (number > 10000 || number < 99999) {
            System.out.print("Digits separated: ");

            for (int i = 10000; i >= 1; i /= 10) {
                int digit = (number / i) % 10; 
                System.out.print(digit + "   "); 
            } 
        }
        else {
            System.out.println("Invalid choice.");
        }
    }
}
