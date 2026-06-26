package Longest_Consecutive_Sequence;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        HashSet<Integer> set = new HashSet<>();

        // Step 1: Put all numbers in a set
        for (int n : nums) {
            set.add(n);
        }

        int longest = 0;

        // Step 2: Check each number
        for (int num : set) {
            // Only start counting if it's the beginning of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                // Step 3: Count forward until chain breaks
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                // Step 4: Track longest sequence length
                longest = Math.max(longest, count);
            }
        }

        System.out.println("Longest consecutive sequence length = " + longest);
    }
}
