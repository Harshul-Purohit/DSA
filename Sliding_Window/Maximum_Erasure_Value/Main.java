package Maximum_Erasure_Value;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    int[] nums = {5,2,1,2,5,2,1,2,5};
    int left = 0 ;
    int sum = 0;
    int maxsum=0;

    for(int right=0;right<nums.length;right++){
      
      while(set.contains(nums[right])){
        set.remove(nums[left]);
        sum-=nums[left++];
      }
      set.add(nums[right]);
      sum+=nums[right];
      maxsum = Math.max(maxsum,sum);
      
    }

    System.out.println(maxsum);

  }
}
