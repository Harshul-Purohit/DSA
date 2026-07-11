package Permutation_in_String;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        // Frequency arrays
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Quick check
        if (s1.length() > s2.length()) {
            System.out.println(false);
            return;
        }

        // Count characters in s1 and first window of s2
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(s1Count, s2Count)) {
            System.out.println(true);
            return;
        }

        // Slide the window across s2
        for (int i = s1.length(); i < s2.length(); i++) {
            // Add new char
            s2Count[s2.charAt(i) - 'a']++;
            // Remove old char
            s2Count[s2.charAt(i - s1.length()) - 'a']--;

            // Check after each slide
            if (Arrays.equals(s1Count, s2Count)) {
                System.out.println(true);
                return;
            }
        }

        // If no match found
        System.out.println(false);
    }
}
