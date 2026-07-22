package Subarray_Sums_Divisible_by_K;

import java.util.HashMap;

public class Main {
  public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1); 

        int prefix = 0;
        int count = 0;

        for (int num : nums) {
            prefix += num;
            int div = prefix % k;

            if (div < 0) div += k;

            count += map.getOrDefault(div, 0);

            map.put(div, map.getOrDefault(div, 0) + 1);
        }

        return count;
    }

     public static void main(String[] args) {
        Main sol = new Main();

        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;

        int result = sol.subarraysDivByK(nums, k);
        System.out.println("Number of subarrays divisible by " + k + " = " + result);
    }
  
}
