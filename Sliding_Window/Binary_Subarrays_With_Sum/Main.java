package Binary_Subarrays_With_Sum;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        System.out.println(numSubarraysWithSum(nums, goal));
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    // Helper: count subarrays with sum <= goal
    private static int atMost(int[] nums, int goal) {
        if (goal < 0) return 0;
        int left = 0, sum = 0, count = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            // shrink window until sum <= goal
            while (sum > goal) {
                sum -= nums[left];
                left++;
            }

            // all subarrays ending at right with sum <= goal
            count += (right - left + 1);
        }
        return count;
    }
}
