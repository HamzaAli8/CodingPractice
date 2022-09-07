package Patterns;

import java.util.HashMap;
import java.util.Map;

public class Practice {


    public int FindMaxSubstringWithDistinctChar(String str, int k){

        if (str == null || str.length() == 0 || k > str.length()){
            throw new IllegalArgumentException();
        }

        int windowStart = 0;
        int maxLength = 0;

        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for(int end = 0; end < str.length(); end++){

            Character rightChar = str.charAt(end);
            charFrequencyMap.put(str.charAt(end), charFrequencyMap.getOrDefault(rightChar,0)+1);

            while(charFrequencyMap.size() > k){

                Character leftChar = str.charAt(windowStart);
                charFrequencyMap.put(leftChar,charFrequencyMap.get(leftChar)-1);

                if (charFrequencyMap.get(leftChar)== 0){
                    charFrequencyMap.remove(leftChar);
                }

                windowStart++;
            }

            maxLength = Math.max(maxLength, end - windowStart + 1);
        }

        return maxLength;
    }


    public int FindMaxSubArray(int [] arr, int k){

        int windowSum = 0;
        int windowStart = 0;
        int maxSum = 0;


        for (int i = 0; i < arr.length; i++){

            windowSum += arr[i];

            if (i >= k-1){

                maxSum = Math.max(windowSum, maxSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return maxSum;
    }


    public int[] sort (int [] nums){

        for (int i =0; i < nums.length; i++){

            int j = nums[i] - 1;

            if (nums[i] != nums[j]){
                swap(i,j,nums);
            }
            else
                i++;
        }
        return nums;
    }

    public void swap(int j, int i, int [] arr){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
