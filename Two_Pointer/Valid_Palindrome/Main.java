package Valid_Palindrome;

public class Main {
  public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";

    StringBuilder clean = new StringBuilder();

    for (char ch : s.toCharArray()) {
      if (Character.isLetterOrDigit(ch)) {
        clean.append(Character.toLowerCase(ch));
      }
    }

    char[] arr = clean.toString().toCharArray();
    int n = arr.length;
    int right = n - 1;
    int left = 0;

    boolean isPalindrome = true;
    while (left < right) {
      if (arr[left] != arr[right]) {
        isPalindrome = false;
        break;
      }
      right--;
      left++;
    }

    System.out.println(isPalindrome);
  }
  
}


// File: Solution.java
// class Solution {
//     public boolean isPalindrome(String s) {
//         int left = 0, right = s.length() - 1;

//         while (left < right) {
//             // Skip non-alphanumeric characters from the left
//             while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
//                 left++;
//             }

//             // Skip non-alphanumeric characters from the right
//             while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//                 right--;
//             }

//             // Compare characters ignoring case
//             if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                 return false; // mismatch found
//             }

//             // Move pointers inward
//             left++;
//             right--;
//         }

//         return true; // all matched
//     }

//     // Quick test runner
//     public static void main(String[] args) {
//         Solution sol = new Solution();

//         System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama")); // true
//         System.out.println(sol.isPalindrome("race a car")); // false
//         System.out.println(sol.isPalindrome("No lemon, no melon")); // true
//     }
// }

