package Subarray_Sum_Equal_k;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {

    HashMap<Integer,Integer> map = new HashMap<>();
    
    int[] nums = {1,1,1};

     int k = 2;

     int ans = 0;

     int prefix = 0;
    

     map.put(0,1);

     for(int num: nums){
       prefix+=num;
      if(map.containsKey(prefix-k)){
        ans+=map.get(prefix-k);
      }
      map.put(prefix,map.getOrDefault(prefix, 0)+1);
     }

     System.out.println(ans);
    }

    
    

   
      

  }
  

