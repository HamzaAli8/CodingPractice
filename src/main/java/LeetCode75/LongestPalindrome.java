package LeetCode75;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {


    public int longestPalindrome(String s){

        int [] charCounts = new int[128];

        for (char c : s.toCharArray()){

            charCounts[c]++;
        }

        int result = 0;

        for (Integer charCount : charCounts){

            result += charCount / 2 * 2;

            if (result %  2== 0 && charCount % 2 == 1){
                result += 1;
            }
        }
        return result;
    }

    public int longestPalindrome2(String s){

        Set<Character> set = new HashSet<>();

        int len = 0;

        for (char c : s.toCharArray()){

            if(set.contains(c)){
                len+= 2;
                set.remove(c);
            }
            else
                set.add(c);
        }
        return set.size() > 0 ? len + 1 : len;
    }

}
