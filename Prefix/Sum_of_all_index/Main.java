package Sum_of_all_index;

import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
    
    
    int[] nums = {1,2,3,4,5};
    int n = nums.length;
    
    // int [] prefix = new int[n];
    // prefix[0]=nums[0];

    for(int i=1; i<n; i++){
      nums[i]+=nums[i-1]; 
      
    }
    
    System.out.println(Arrays.toString(nums));
    
    
  }
}
