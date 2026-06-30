package Two_sum_II;

public class Main {
  public static void main(String[] args) {
    
    
    int[] numbers = {2,7,11,15};
    int n = numbers.length;
    int target = 9;
    int left = 0;
    int right = n-1;
    while(left<right){
      int sum = numbers[left]+numbers[right];
    
      if(numbers[left]+numbers[right]==target){
        System.out.println((left+1) + " " + (right+1));
        break;
      } else if(sum<target){
        left++;
      }else if(sum>target){
        right--;
      }
    }
  }
}
