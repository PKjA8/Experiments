public class TableSquareQube {
    public static void main(String[] args) {
        System.out.printf("%s %s %s%n", "Number", "Square", "Cube");
  
        for (int number = 0; number <= 10; number++) {
            int square = number * number;       
            int cube = number * number * number; 

            System.out.printf("%d     %d     %d     %n", number, square, cube);
        }
    }
}
