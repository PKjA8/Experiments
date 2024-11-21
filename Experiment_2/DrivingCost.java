import java.util.Scanner;
class CalculateDrivingCost{
    void drCost( int a, int b,int c,int d){
        int charges = a*b+c+d;
        System.out.println("Total cost is "+charges);
    }
}    
public class DrivingCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("total miles driven per day");
        int a = sc.nextInt();
        System.out.println("cost per gallon of gasoline");
        int b = sc.nextInt();
        System.out.println("average fees per day");
        int c = sc.nextInt();
        System.out.println("tolls per day");
        int d = sc.nextInt();
        CalculateDrivingCost ab = new CalculateDrivingCost();
        ab.drCost(a,b,c,d);
    }
}
