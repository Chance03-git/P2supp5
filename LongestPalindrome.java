import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class LongestPalindrome {
     /**
     * Test case to verify the findLongestPalindrome function.
     */
    @Test
    public void testFindLongestPalindrome() {
        // Test case: general odd-length palindrome
        String input = "babad";
        String expectedOutput = "aba"; // or "bab", both are valid
        String result = findLongestPalindrome(input);

        // Check if the result is as expected
        assertEquals(expectedOutput, result);
    }

    /**
     * Main method for manual testing and debugging.
     */
    public static void main(String[] args) {
        String input = "babad";
        System.out.println("Input: " + input);
        System.out.println("Longest Palindromic Substring: " + findLongestPalindrome(input));
    }
}
}
