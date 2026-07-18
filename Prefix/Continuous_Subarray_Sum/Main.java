package Continuous_Subarray_Sum;

import java.util.HashMap;

public class Main {
   public static void main(String[] args) {
   

   int[] nums = {23,2,4,6,7};
   int k =6;

   HashMap<Integer,Integer> map = new HashMap<>();

   map.put(0,-1);

   int sum=0;


   for(int i=0; i<nums.length; i++){
    sum+=nums[i];

    int rem = sum%k;

    if(map.containsKey(rem)){
      if(i-map.get(rem)>=2){
        System.out.println(true);
        return;
      }
    }else{
      map.put(rem,i);
    }

    
    
  }
  
  System.out.println(false);

  }
}
