package Maximum_Average_Subarray_I;

public class Main {
  public static void main(String[] args) {
     
    int[] nums = {1,12,-5,-6,50,3};

    int k = 4;

  int sum = 0;

  for(int i=0; i<k; i++){
    sum+=nums[i];
  }

int maxavg = sum;

for(int i=k; i<nums.length; i++){
  sum+= nums[i] - nums[i-k];
  maxavg = Math.max(maxavg,sum);
}

double maxAvg = (double) maxavg/k;
System.out.println(maxAvg);

  }
  
}
