package Container_With_Most_Water;

public class Main {
  public static void main(String[] args) {

    int[] height = {1,8,6,2,5,4,8,3,7};

    int left = 0;
    int right = height.length-1;
    int max = 0;

    while(left<right){
      int w = Math.min(height[left],height[right]);
      int h = right-left;
      int area = w*h;
      max = Math.max(max,area);

      if(height[left]<height[right]){
        left++;
      }else{
        right--;
      }
    }

    System.out.println(max);
    
  }


  
}
