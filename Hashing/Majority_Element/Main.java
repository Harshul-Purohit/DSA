package Majority_Element;
import java.util.HashMap;

public class Main {


public class Main1 {
  public static void main(String[] args) {
    int[] nums = {1,3,2,5,1,3,1,5,1};
    int n = nums.length;

    
    HashMap<Integer,Integer> map = new HashMap<>();

    for(int num : nums){
      if(map.containsKey(num)){
        int frq = map.get(num);
        map.put(num,frq+1);
      }else{
        

        map.put(num,1);
      }
    }

    for(int key:map.keySet()){
      if(map.get(key)> n/3){
        System.out.println(key);
      }
    }


  }
}

  
}


/*
import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            if (map.containsKey(num)) {

                int freq = map.get(num);
                map.put(num, freq + 1);

            } else {

                map.put(num, 1);
            }
        }

        for (int key : map.keySet()) {

            if (map.get(key) > n / 2) {
                return key;
            }
        }

        return -1;
    }
}
 */
