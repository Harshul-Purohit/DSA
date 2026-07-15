package Imutable;

public class Main {

   int[] prefix;
  
  public Main(int[]nums){
    int n = nums.length;
    prefix=new int[n];
    prefix[0]=nums[0];
    
    for(int i=1;i<n;i++){
      prefix[i] = prefix[i - 1] + nums[i];
    }
    
    
  }
  
  public int sumRange(int left,int right){
    if(left == 0)
      return prefix[right];
    
    return prefix[right] - prefix[left - 1];
    
  }
  
  
  
  
  public static void main(String[] args) {
    
    int[] nums={-2, 0, 3, -5, 2, -1};
    Main numArray = new Main(nums);

    System.out.println(numArray.sumRange(2, 4));

    
  }
  
}
