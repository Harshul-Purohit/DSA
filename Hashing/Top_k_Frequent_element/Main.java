package Top_k_Frequent_element;

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create buckets (index = frequency)
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }

        // Step 3: Collect top k from highest frequency
        List<Integer> resultList = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && resultList.size() < k; i--) {
            if (buckets[i] != null) {
                resultList.addAll(buckets[i]);
            }
        }

        // Step 4: Convert to array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}


public class Main {
      public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] result = sol.topKFrequent(nums, k);

        System.out.println(Arrays.toString(result)); // Output: [1, 2]
    }
  
}
