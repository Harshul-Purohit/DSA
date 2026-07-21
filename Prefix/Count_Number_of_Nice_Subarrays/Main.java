package Count_Number_of_Nice_Subarrays;

import java.util.HashMap;

public class Main {
      public int numberOfSubarrays(int[] nums, int k) {
        int[] arr = new int[nums.length];
        int count =0;

        for(int i=0;i<nums.length;i++){
          if(nums[i]%2==0){
            arr[i]=0;
          }else{
            arr[i]=1;
          }
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;

        for(int i=0;i<arr.length;i++){
          sum+=arr[i];
          count+= map.getOrDefault(sum-k, 0);
          map.put(sum,map.getOrDefault(sum, 0)+1);
        }

      return count;   
    }
        public static void main(String[] args) {
        Main obj = new Main();
        int[] nums = {1,1,2,1,1};
        int k = 3;
        System.out.println("Number of nice subarrays = " + obj.numberOfSubarrays(nums, k));
    }
}

