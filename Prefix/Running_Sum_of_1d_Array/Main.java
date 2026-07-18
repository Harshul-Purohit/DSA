package Running_Sum_of_1d_Array;

public class Main {

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];  // base case

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Main obj = new Main();
        int[] ans = obj.runningSum(nums);

        // Print result
        for (int val : ans) {
            System.out.print(val + " ");
        }
        // Output: 1 3 6 10
    }
}