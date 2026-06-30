package Sort_0s_1s;

public class main {
  public static void main(String[] args) {
       int[] nums = {0,1,0,1,0,1};
    int n = nums.length;

    int left = 0;
    int right = n-1;

while(left<right){

  if(nums[left]==1&&nums[right]==0){
    int temp = nums[right];
    nums[right]=nums[left];
    nums[left]=temp;
    left++;
    left--;
  }

  if(nums[left]==0){
    left++;
  }
  if(nums[right]==1){
    right--;
  }

}

    for(int num :nums){
      System.out.println(num);
    }

  }
  
}
