import java.util.*;

public class PalindromeCheckerApp {

    // Recursive function
    public static boolean isPalindrome(String str, int left, int right) {

        // Base case
        if (left >= right) {
            return true;
        }

        // If mismatch
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize input
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean result = isPalindrome(cleaned, 0, cleaned.length() - 1);

        if (result) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

        sc.close();
    }
}