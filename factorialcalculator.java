
public class factorialcalculator {
    public static void main(String[] args) {
        int num = 5; // Predifined num to calculate factorial
        int factorial = 1;

        for (int i = 1; i <= num; i++) { // Loop through numbers
            factorial *= i; // Multiply current number
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
