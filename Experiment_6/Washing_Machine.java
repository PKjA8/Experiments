import java.util.Scanner;

class WashingMachine {
    void switchOn() {
        System.out.println("Washing Machine is ON");
    }

    int acceptClothes(int noOfClothes) {
        System.out.println("Accepted " + noOfClothes + " clothes");
        return noOfClothes;
    }

    void acceptDetergent() {
        System.out.println("Detergent accepted");
    }

    void switchOff() {
        System.out.println("Washing Machine is OFF");
    }
}

public class Washing_Machine{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        WashingMachine wm = new WashingMachine();
        wm.switchOn();
        System.out.print("Enter the number of clothes: ");
        int clothes = sc.nextInt();  
        wm.acceptClothes(clothes);
        wm.acceptDetergent();
        wm.switchOff();
    }
}