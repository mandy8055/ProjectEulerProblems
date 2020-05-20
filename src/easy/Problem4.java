package easy;

import utility.Utility;

public class Problem4 {
    /* My Solution
    public static void main(String[] args){
        int largestPalindrome = 0;
        for(int i = 999; i >= 100; i--){
            for(int j = i; j >= 100; j--){
                if(Utility.isPalindrome(i * j) && (i * j) > largestPalindrome)largestPalindrome = i * j;
            }
        }
        System.out.print(largestPalindrome);
    }*/

//    Enhanced Solution --> Analyse
      public static void main(String[] args){
          int largestPalindrome = 0;
          int incrementValue;
          for(int i = 999; i >= 100; i--){
              int j;
              if(i % 11 == 0){
                  j = 999;
                  incrementValue = 1;
              }else{
                  j = 990;
                  incrementValue = 11;
              }
              for(;j >= i; j -= incrementValue){
                  if((j * i) <= largestPalindrome)break;
                  if(Utility.isPalindrome(j * i))largestPalindrome = j * i;
              }

          }
          System.out.println(largestPalindrome);
      }
}
