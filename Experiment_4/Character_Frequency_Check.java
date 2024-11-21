import java.util.Scanner;
public class Character_Frequency_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String inputString = sc.nextLine();

        System.out.println("Enter the threshold (n):");
        int threshold = sc.nextInt();

        int[] freq = new int[128]; 


        for (char ch : inputString.toCharArray()) {
            freq[ch]++;
        }

        System.out.println("Characters exceeding the threshold:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > threshold) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
    }
}
