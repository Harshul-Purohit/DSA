package Range_Sum_Query_Immutable;
import java.util.HashMap;


public class Main {
  int prefix[];

  public Main(int[] nums){
    prefix = new int[nums.length+1];
    prefix[0]=0;

    for(int i= 0;i<nums.length;i++){
      prefix[i+1] = prefix[i]+nums[i];
    }
  }

  public int sumRange(int left, int right){
    return prefix[right+1]-prefix[left];
  }
  public static void main(String[] args) {
    
int[] nums={-2, 0, 3, -5, 2, -1};
Main main = new Main(nums);
System.out.println(main.sumRange(0, 2));

  }
}
