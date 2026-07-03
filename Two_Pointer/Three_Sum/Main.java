package Three_Sum;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    List<List<Integer>> ans = new ArrayList<>();

    int[] nums={-1,0,1,2,-1,-4};
    Arrays.sort(nums);
  

    
    
    for(int i = 0; i<nums.length-2; i++){
        int left = i+1;
    int right = nums.length-1;

 if (i > 0 && nums[i] == nums[i - 1]) continue;

        while(left<right){
        int sum = nums[i]+nums[left]+nums[right];
        
          while (left < right && nums[left] == nums[left + 1]) left++;
          while (left < right && nums[right] == nums[right - 1]) right--;

        if(sum==0){
          ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
          right--;
          left++;;
        }else if(sum<0){
          left++;
        }else{
          right--;
        }
        
      }
      
    }

    System.out.println(ans);

  }
}
