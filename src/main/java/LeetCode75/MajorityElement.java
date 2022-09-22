package LeetCode75;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int [] nums){


        Map<Integer, Integer> majority = new HashMap<>();

        for(int c : nums){

            majority.put(c,majority.getOrDefault(c,0) + 1);
        }

        Map.Entry<Integer,Integer> maxEntry = null;

        for(var entry: majority.entrySet()) {

            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {

                maxEntry = entry;
            }

        }
        assert maxEntry != null;
        return maxEntry.getKey();
    }
}
