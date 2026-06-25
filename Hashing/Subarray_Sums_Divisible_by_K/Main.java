import java.util.HashMap;

public class Main {
  public static void main(String[] args) {

    HashMap<Integer,Integer> map = new HashMap<>();

    int[] nums = {4,5,0,-2,-3,1};

    map.put(0,1);

    int prefix = 0;
    int count = 0;
    int k=5;

    for(int num:nums){
      prefix+=num;
      int div= prefix%k;

        if (map.containsKey(div)) {
        count += map.get(div);
    }


      map.put(div,map.getOrDefault(div,0)+1);

    }

    System.out.println(count);

    
  }
  
}



// import java.util.HashMap;


// class Solution {
//     public int subarraysDivByK(int[] nums, int k) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         map.put(0, 1); 

//         int prefix = 0;
//         int count = 0;

//         for (int num : nums) {
//             prefix += num;
//             int div = prefix % k;

//             if (div < 0) div += k;

//             count += map.getOrDefault(div, 0);

//             map.put(div, map.getOrDefault(div, 0) + 1);
//         }

//         return count;
//     }
// }
