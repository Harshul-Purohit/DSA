package Find_Missing_Num;
import java.util.HashSet;
import java.util.HashMap;

//Find All Numbers Disappeared in an Array

public class Main {
  public static void main(String[] args) {

    int[] nums = {4,3,2,7,8,2,3,1};
    
    // HashSet<Integer> set = new HashSet<>();
    
    
    // for(int num :nums){
    //   set.add(num);
    // }

    // for(int i=1; i<nums.length; i++){
    //   if(!set.contains(i)){
    //     System.out.println(i);
    //   }
    // }


    // HashMap<Integer,Integer> map = new HashMap<>();

    // for(int num :nums){
    //   map.put(num,1);
    // }

    // for(int i=1; i<nums.length; i++){
    //   if(!map.containsKey(i)){
    //     System.out.println(i);
    //   }
    // }



    }
  }


  /*
  import java.util.*;

class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // nums comes from LeetCode input
        for(int num : nums){
            set.add(num);
        }

        List<Integer> ans = new ArrayList<>();

        for(int i = 1; i <= nums.length; i++){

            if(!set.contains(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}
   */

