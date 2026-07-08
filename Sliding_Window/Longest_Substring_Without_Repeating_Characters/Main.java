package Longest_Substring_Without_Repeating_Characters;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
HashSet<Character> set = new HashSet<>();
    String s = "abcabcbb";

    int left = 0;
    int maxlen = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      while (set.contains(c)) {
        set.remove(s.charAt(left));
        left++;
      }

      set.add(c);
      maxlen = Math.max(maxlen, i - left + 1);
    }

    System.out.println(maxlen);


    





  }

  
  
}
