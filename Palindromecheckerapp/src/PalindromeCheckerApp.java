import java.util.*;
import java.util.stream.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize input
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse using Streams
        String reversed = IntStream.range(0, cleaned.length())
                .mapToObj(i -> cleaned.charAt(cleaned.length() - 1 - i))
                .map(String::valueOf)
                .collect(Collectors.joining());

        // Compare
        if (cleaned.equals(reversed)) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

        sc.close();
    }
}