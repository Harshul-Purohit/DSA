package group_Anagram;

import java.util.*;

public class Main {
    // Method to group anagrams
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Step 1: Convert string to char array
            char[] c = s.toCharArray();

            // Step 2: Sort the char array
            Arrays.sort(c);

            // Step 3: Convert sorted array back to string (key)
            String str = new String(c);

            // Step 4: If key not present, create new list
            map.putIfAbsent(str, new ArrayList<>());

            // Step 5: Add original string to the list
            map.get(str).add(s);
        }

        // Step 6: Return grouped anagrams
        return new ArrayList<>(map.values());
    }

    // ✅ Main method (entry point)
    public static void main(String[] args) {
        Main obj = new Main();

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = obj.groupAnagrams(strs);

        // Print result
        System.out.println(result);
    }
}
