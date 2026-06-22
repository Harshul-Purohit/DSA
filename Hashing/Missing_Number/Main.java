package Missing_Number;
import java.util.HashSet;


public class Main {

  public static void main(String[] args) {

    int[] nums = {3,0,1};
    int n = nums.length;
    

    HashSet<Integer> set = new HashSet<>();

    for(int num : nums){
      set.add(num);
    }

    for(int i=0;i<=n;i++){
      if(!set.contains(i)){
        System.out.println(i);
      }
        

    }

  }
  
}


