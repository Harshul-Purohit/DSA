package Longest_Repeating_Character_Replacement;

public class Main {
  public static void main(String[] args) {
    
    
    String s = "ABAB";
    int[] count = new int[26];
    int k = 2;
    int maxlen =0 ;
    int left = 0;
    int len = 0;
    
    for(int i = 0 ; i<s.length(); i ++){
       count[s.charAt(i)-'A']++;
       maxlen = Math.max(maxlen,count[s.charAt(i)-'A']);

       while((i-left+1)-maxlen>k){
        count[s.charAt(left)]--;
        left++;

       }

       len = Math.max(len,i-left+1);
    }

    System.out.println(len);
      
    }
  }
