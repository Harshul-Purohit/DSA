package Sort_Colors;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] nums = {2,0,2,1,1,0};

    int left = 0;
    int right = nums.length-1;
    int i = 0;


    while(i<=right){

      if(nums[i]==0){
        int temp = nums[i];
        nums[i] = nums[left];
        nums[left] = temp;
        i++;
        left++;
      }else if(nums[i]==2){
        int temp = nums[i];
        nums[i] = nums[right];
        nums[right] = temp;
        right --;
      }else{
        i++;
      }

    }

    System.out.println(Arrays.toString(nums));

  }
  
}
