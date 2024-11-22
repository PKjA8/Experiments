// Class to calculate sin(x) using the series expansion
class SinCalculator extends Thread {
    private double x; // The value of x for which sin(x) is to be calculated
    private double result; // The result of the sin(x) calculation

    // Constructor to initialize the value of x
    public SinCalculator(double x) {
        this.x = x;
    }

    // Method to calculate sin(x) using the series expansion
    @Override
    public void run() {
        result = 0.0;
        int terms = 10; // Number of terms in the series
        for (int i = 0; i < terms; i++) {
            double term = Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
            if (i % 2 == 0) {
                result += term; // Add for even terms
            } else {
                result -= term; // Subtract for odd terms
            }
        }
        System.out.println("sin(" + x + ") = " + result);
    }

    // Method to calculate factorial of a number
    private long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

// Class to calculate cos(x) using the series expansion
class CosCalculator extends Thread {
    private double x; // The value of x for which cos(x) is to be calculated
    private double result; // The result of the cos(x) calculation

    // Constructor to initialize the value of x
    public CosCalculator(double x) {
        this.x = x;
    }

    // Method to calculate cos(x) using the series expansion
    @Override
    public void run() {
        result = 1.0;
        int terms = 10; // Number of terms in the series
        for (int i = 1; i < terms; i++) {
            double term = Math.pow(x, 2 * i) / factorial(2 * i);
            if (i % 2 == 0) {
                result += term; // Add for even terms
            } else {
                result -= term; // Subtract for odd terms
            }
        }
        System.out.println("cos(" + x + ") = " + result);
    }

    // Method to calculate factorial of a number
    private long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

// Main class to run the program
public class SinCos {
    public static void main(String[] args) {
        double x = Math.toRadians(30); // Convert 30 degrees to radians

        // Create threads to calculate sin(x) and cos(x)
        SinCalculator sinThread = new SinCalculator(x);
        CosCalculator cosThread = new CosCalculator(x);

        // Start the threads
        sinThread.start();
        cosThread.start();

        try {
            // Wait for threads to finish
            sinThread.join();
            cosThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Compare with the built-in Math functions
        System.out.println("Using Math.sin(x) = " + Math.sin(x));
        System.out.println("Using Math.cos(x) = " + Math.cos(x));
    }
}
