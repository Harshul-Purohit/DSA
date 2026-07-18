package Find_pivot_element;

public class Main {


    public int pivotIndex(int[] nums) {

        int n = nums.length;

        int totalSum = 0;

        // Calculate total sum
        for(int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for(int i = 0; i < n; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            // Check pivot condition
            if(leftSum == rightSum) {
                return i;
            }

            // Move current element to left side
            leftSum += nums[i];
        }

        return -1;
    }
}

