package Subarray_Sum_Equals_K;

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    // int[] nums = {1,1,1};
    // int n = nums.length;
    // int k = 2;

    // HashSet<Integer> set = new HashSet<>();
    // ArrayList<Integer> ans = new ArrayList<>();

    // for(int num : nums){
    //   int target = k-num;
    //   if(set.contains(target)){
    //     ans.add(target);
    //   }
    //   set.add(target);
    // }

    // System.out.println(ans.size());

   int[] nums = {1,1,1};
   int k =2;

   HashMap<Integer,Integer> map = new HashMap<>();

   int sum=0;
   int count=0;
   map.put(0,1);

   for(int num:nums){
    sum+=num;

    if(map.containsKey(sum-k)){
      count+=map.get(sum-k);
    }

    map.put(sum, map.getOrDefault(sum, 0) + 1);

   }


System.out.println(count);

  }



    




}
