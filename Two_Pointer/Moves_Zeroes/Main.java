package Moves_Zeroes;

public class Main {
  public static void main(String[] args) {
    
    
    int[] nums={0,0,1,12,3};
    int index=0;
    
    
    for(int i=0;i<nums.length;i++){
      if(nums[i]!=0){

        nums[index]=nums[i];
        index++;
      }
    }

    while(index<nums.length){
      nums[index]=0;
      index++;
    }

      
      
      for(int num:nums){
        System.out.println(num);
      }
      
      
      
      
      
      
    }
}
