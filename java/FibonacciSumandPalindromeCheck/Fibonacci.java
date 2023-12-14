package java.Fibonacci-Sum-and-Palindrome-Check;

// Fibonacci.java
public class Fibonacci {
    public static void main(String[] args) {
        int limit = 4000000;
        int sum = 0;
        int prev = 1;
        int current = 2;

        while (current <= limit) {
            if (current % 2 == 0) {
                sum += current;
            }

            int next = prev + current;
            prev = current;
            current = next;
        }

        System.out.println("Sum of even-valued terms in Fibonacci sequence: " + sum);
    }
}

// PalindromeChecker.java
import javax.swing.JOptionPane;

public class PalindromeChecker {
    public static void main(String[] args) {
        // GUI interface to enter the number
        String input = JOptionPane.showInputDialog("Enter a number:");
        int number = Integer.parseInt(input);

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            JOptionPane.showMessageDialog(null, number + " is a palindrome.");
        } else {
            JOptionPane.showMessageDialog(null, number + " is not a palindrome.");
        }
    }

    private static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return original == reverse;
    }
}
