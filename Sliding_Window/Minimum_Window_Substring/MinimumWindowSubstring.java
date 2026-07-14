package Minimum_Window_Substring;
import java.util.HashMap;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        // Frequency map for target string
        HashMap<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        // Sliding window variables
        HashMap<Character, Integer> windowMap = new HashMap<>();
        int left = 0, right = 0;
        int required = targetMap.size();
        int formed = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

            if (targetMap.containsKey(c) && 
                windowMap.get(c).intValue() == targetMap.get(c).intValue()) {
                formed++;
            }

            // Try to shrink window
            while (left <= right && formed == required) {
                char ch = s.charAt(left);

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                windowMap.put(ch, windowMap.get(ch) - 1);
                if (targetMap.containsKey(ch) && 
                    windowMap.get(ch).intValue() < targetMap.get(ch).intValue()) {
                    formed--;
                }
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("Minimum Window Substring: " + minWindow(s, t));
    }
}
