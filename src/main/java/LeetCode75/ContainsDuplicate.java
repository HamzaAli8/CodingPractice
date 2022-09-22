package LeetCode75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicate {



    public boolean containsDuplicate(int [] nums){

        Map<Integer, Integer> duplicate = new HashMap<>();

        for(int c : nums){

            duplicate.put(c,duplicate.getOrDefault(c,0) + 1);
        }

       var entry = duplicate.entrySet();

        for(var c: entry){

            if (c.getValue() > 1){
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array is null");
        }
        if (nums.length <= 1) {
            return false;
        }

        HashSet<Integer> found = new HashSet<>();
        for (int n : nums) {
            if (!found.add(n)) {
                return true;
            }
        }

        return false;
    }

    public boolean containsDuplicate3(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }


}
