package Contain_Dublicate;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {

  //   int[] nums = {1,2,3,1};
   
  //   HashMap<Integer,Integer> map = new HashMap<>();

  //   for(int i =0; i<nums.length; i++){
  //     if(map.containsKey(nums[i])){
  //       System.out.println("true");
  //       return;
  //     }
  //     map.put(nums[i],i);
  //   }

  //   System.out.println("false");


    HashSet<Integer> map = new HashSet<>();

    int[] nums = {1,2,3,1};
    
    for(int num:nums){
      if(map.contains(num)){
        System.out.println(true);
        return;
      }
      map.add(num);
    }
    System.out.println(false);





  } 
}
