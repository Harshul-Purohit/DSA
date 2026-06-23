package Intersection_of_two_array;

import java.util.HashSet;
import java.util.ArrayList;


public class Main {
  public static void main(String[] args) {
    int[] nums1 = {1,2,2,1};
    int[] nums2 = {2,2};

    HashSet<Integer> set = new HashSet<>();
    HashSet<Integer> ans = new HashSet<>();


    for(int num:nums1){
      set.add(num);
    }

    for(int num:nums2){
      if(set.contains(num)){
        ans.add(num);
      }
    }

    // hashset into array

    // int[] result = new int[ans.size()];
    // int i = 0;
    //  for(int num:ans){
    //   result[i++] = num;
    //  }


    //  System.out.println(result);





  }
}
