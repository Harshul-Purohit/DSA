package Fruit_Into_Baskets;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<Integer,Integer> map = new HashMap<>();

    int[] fruits = {0,1,2,2};
    int left = 0;
    int maxlen = 0;

    for(int i = 0; i<fruits.length; i++){
      map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
      
      while(map.size()>2){
    map.put(fruits[left],map.get(fruits[left])-1);
    if(map.get(fruits[left])==0){
      map.remove(fruits[left]);
    }
    left++;
   }

   maxlen = Math.max(maxlen,i-left+1);
  }
  System.out.println(maxlen);
}
}
