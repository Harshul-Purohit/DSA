package Maximum_Number_of_Vowels_in_a_Substring;
import java.util.HashSet;

public class Main {
   public static void main(String[] args) {

    HashSet<Character> vowels = new HashSet<>();
    vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');

    String s = "abciiidef";
    int k = 3;
    int count = 0;



    for(int i = 0 ; i<k; i++){
      if(vowels.contains(s.charAt(i))){
        count++;
      }
    }

     int maxCount = count;

     for(int i = k ; i<s.length(); i++){

      if(vowels.contains(s.charAt(i))){
        count++;
      }
      if(vowels.contains(s.charAt(i-k))){
        count--;
      }

      maxCount = Math.max(maxCount,count);

     }

     System.out.println(maxCount);


   }
  
}
