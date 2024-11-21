import java.util.Scanner;

public class Perfect_String_Check {
    public static String perfect_string(String str) {
        int[] arr = new int[26];

        // Count the occurrences of each character in the string
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }

        // Check if any character occurs more than once
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 1) {
                return "Not Perfect String";
            }
        }
        return "Perfect String";
    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        System.out.println(perfect_string(input));
    }
}
