package Find_pivot_element;

public class Main {


  public static void main(String[] args) {
    int[] nums = {1,7,3,6,5,6};
    int totalsum = 0;


for(int num: nums){
totalsum+=num;
}

int leftsum = 0;

for(int i=0; i<nums.length;i++){
    int rightsum = totalsum-leftsum-nums[i];

    if(rightsum==leftsum){
        System.out.println(i);
        break;
    }

    leftsum+=nums[i];

}

  }
}

