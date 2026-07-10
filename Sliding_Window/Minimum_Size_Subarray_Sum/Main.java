package Minimum_Size_Subarray_Sum;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int target = 7;
        int[] nums = {2,3,1,2,4,3};

        int result = sol.minSubArrayLen(target, nums);
        System.out.println("Minimum size subarray length = " + result);
    }
}

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += nums[right];  // expand window

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
