package Imutable;

public class Main {
      private int[] prefix;

    // Constructor: build the prefix sum array
    public Main(int[] nums) {
        // +1 because we want prefix[0] = 0 (base case)
        prefix = new int[nums.length + 1];

        // Base case: sum of zero elements = 0
        prefix[0] = 0;

        // Build prefix sums step by step
        for (int i = 0; i < nums.length; i++) {
            // prefix[i+1] = sum of nums[0..i]
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    // Query: return sum of nums[left..right]
    public int sumRange(int left, int right) {
        // Difference of two prefix sums gives the range sum
        return prefix[right + 1] - prefix[left];
    }

    
    
    public static void main(String[] args) {
      int[] nums = {-2, 0, 3, -5, 2, -1};
      Main main = new Main(nums);
      
      System.out.println(main.sumRange(0, 2)); // Output: 1
      System.out.println(main.sumRange(2, 5)); // Output: -1
      System.out.println(main.sumRange(0, 5)); // Output: -3
    }
    
  }
