package Compare_prefix_sufix;

import java.util.Scanner;

public class Main {
    static int findArraySum(int[] arr){
    int totalSum=0;
    for(int i=0;i<arr.length;i++){
      totalSum+=arr[i];
    }
    return totalSum;
  }

  static boolean equalSumPartition(int[] arr){
    int totalSum = findArraySum(arr);

    int prefix = 0;
    for(int i=0;i<arr.length;i++){
      prefix+=arr[i];
      int suffixSum = totalSum-prefix;
      if(suffixSum == prefix){
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    
    
//     int[] nums = {5,3,2,6,3,1};
//     int n= nums.length;
//     int totalsum = 0;
    
// for(int num : nums){
//   totalsum+=num;
// }

// int prefix = 0;
//  for(int i=0;i<n;i++){
//    prefix +=nums[i];
//    int suffixsum = totalsum-prefix;
//    if(suffixsum==prefix){
//      System.out.println("true"+i);
//     }
//  }



Scanner sc = new Scanner(System.in);
System.out.println("enter the size of array");
int n = sc.nextInt();
int[] arr = new int[n];

System.out.println("enter"+n+"element");
for(int i=0;i<n;i++){
  arr[i]=sc.nextInt();
}

System.out.println(equalSumPartition(arr));




}
}
