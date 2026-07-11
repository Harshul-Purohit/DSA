package Fruits_Into_Baskets_II;

public class Main {
  public static void main(String[] args) {
    int[] f= {4,2,5};
    int[] b= {3,5,4};
    int unplaced=0;
    boolean[] used = new boolean[b.length];

    for(int i=0;i<f.length;i++){
      boolean placed = false;

      for(int j=0;j<b.length;j++){
        if(!used[j] && b[j]>=f[i]){
          used[j]=true;
          placed = true;
          break;
        }
      }
      if(!placed){
        unplaced++;
      }
    }

   System.out.println(unplaced);

  }
  
}
