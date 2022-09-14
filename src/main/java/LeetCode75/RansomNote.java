package LeetCode75;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public boolean canConstruct(String magazine, String ransomNote){

        Map<Character,Integer> letters = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++){

            char ransomChar = ransomNote.charAt(i);

            letters.put(ransomChar, letters.getOrDefault(ransomChar,0) + 1);
        }

        for(int j = 0; j < magazine.length(); j++){

            char magazineChar = magazine.charAt(j);
            letters.put(magazineChar, letters.getOrDefault(magazineChar,0)-1);
            if (letters.get(magazineChar) <= 0)
                letters.remove(magazineChar);
        }
        return letters.isEmpty();
    }
}
