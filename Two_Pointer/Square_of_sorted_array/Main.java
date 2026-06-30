package Square_of_sorted_array;

  import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    int[] nums = {-4,-1,0,3,10};

    // ArrayList<Integer> ans = new ArrayList<>();

    // for(int num :nums){
    //   int sq = num*num;
    //   ans.add(sq);
      
    // }

    // Collections.sort(ans);

    // System.out.println(ans);

  int n = nums.length;

  int[] ans = new int[n];

  int left = 0;
  int right = n-1;
  int index = n-1;

  while(left<=right){
    int rightsquare = nums[right]*nums[right];
    int leftsquare = nums[left]*nums[left];

      if(rightsquare>leftsquare){
        ans[index]=rightsquare;
        right--;
      }else{
        ans[index]=leftsquare;
        left++;
      }
      index--;


  }



  System.out.println(Arrays.toString(ans));

  }
  
  }

