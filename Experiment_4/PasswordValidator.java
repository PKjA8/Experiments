import java.util.Scanner;

class CheckPassword {
    String password;
    boolean hasLowerCase = false;
    boolean hasDigit = false;
    boolean noUpperCase = true;
    boolean noSpecialChar = true;
    boolean validLength = false;

    CheckPassword(String password) {
        this.password = password;
    }

    void validatePassword() {
        if (password.length() >= 5 && password.length() <= 12) {
            validLength = true;
        }
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                hasLowerCase = true;
            } 
            else if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                hasDigit = true;
            }
            else if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                noUpperCase = false;
            } 
            else if ((password.charAt(i) >= 0 && password.charAt(i) <= 47)
                    || (password.charAt(i) >= 58 && password.charAt(i) <= 64)
                    || (password.charAt(i) >= 91 && password.charAt(i) <= 96)
                    || (password.charAt(i) >= 123 && password.charAt(i) <= 127)) {
                noSpecialChar = false;
            }
        }

        if (hasLowerCase && hasDigit && noUpperCase && noSpecialChar && validLength) {
            System.out.println("Correct Password");
        } 
        else {
            System.out.println("Incorrect Password");
        }
    }
}

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter password:");
        String userPassword = SC.nextLine();

        CheckPassword passwordChecker = new CheckPassword(userPassword);

        passwordChecker.validatePassword();

    }
}
