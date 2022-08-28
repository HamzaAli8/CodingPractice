package Patterns;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SlidingWindow {

// brute force
    public int findMaxSubStringSum(int [] arr, int k){

        int sum,maxSum = 0;


        for(int i = 0; i < arr.length-k; i++){

            sum = 0;

            for(int j = i;  j < i+k; j++){

                sum += arr[j];
            }

            maxSum = Math.max(sum,maxSum);
        }

        return maxSum;
    }
 // more elegant way of doing it
    
    public int findMaxSubStringSum2(int [] arr, int k){

        int start = 0,sum = 0, maxSum = 0;

        for(int i = 0; i < arr.length; i++){

            sum += arr[i];

            if(i >= k-1){

                maxSum = Math.max(maxSum,sum);
                sum -= arr[start];
                start++;
            }
        }

        return maxSum;
    }


    public int findMinSubArray(int [] arr, int s){

        int windowSum = 0, minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){

            windowSum += arr[windowEnd];

            while(windowSum >= s){

                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return minLength;
    }


    public void StringToCharArray(String hello){

        char [] arr =  hello.toCharArray();

        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();

        for(char c : arr){

            characterIntegerHashMap.put(c,characterIntegerHashMap.getOrDefault(c,0) + 1);
            int i = characterIntegerHashMap.size();
        }

        System.out.println(characterIntegerHashMap);

    }

    public int FindLongestSubstringDistinctChar(String str, int k){

        if(str == null || str.length() == 0 || str.length() < k){

            throw new IllegalArgumentException();
        }

        int start = 0, maxLength = 0;

        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        for(int end = 0; end < str.length(); end++){

            char rightChar = str.charAt(end);
            charFrequencyMap.put(rightChar,charFrequencyMap.getOrDefault(rightChar,0) +1);

            while(charFrequencyMap.size() > k){

                char leftChar = str.charAt(start);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) -1);
                if(charFrequencyMap.get(leftChar) == 0){
                    charFrequencyMap.remove(leftChar);
                }
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

        public int romanToInt(String s) {

            // Approach 1 - Easiest O(n)
            Map<Character,Integer> roman = new HashMap<Character,Integer>();
            roman.put('I',1);
            roman.put('V',5);
            roman.put('X',10);
            roman.put('L',50);
            roman.put('C',100);
            roman.put('D',500);
            roman.put('M',1000);

            int result = 0;
            char[] input = s.toCharArray();
            int len = input.length;
            for(int i=len-1;i>=0;i--){
                result += roman.get(input[i]);
                if(i!=0 && roman.get(input[i-1]) < roman.get(input[i])){
                    result -= roman.get(input[i-1]);
                    i--;
                }
            }
            return result;
        }



    public int findProfit(int [] prices){

        int buyIdx = 0;
        int currIdx = 1;
        int profit = 0;

        while(currIdx != prices.length) {

            if(prices[currIdx] < prices[currIdx - 1]) {

                profit += prices[currIdx - 1] - prices[buyIdx];
                buyIdx = currIdx;
            }

            currIdx++;
        }

        profit += prices[currIdx - 1] - prices[buyIdx];
        return profit;
    }


    public int maxProfit(int[] prices) {
        int sum = 0;
        int lsf = prices[0];
        for(int i=0; i<prices.length; i++){
            lsf = Math.min(prices[i], lsf);
            sum = Math.max(sum, prices[i] - lsf);
        }
        return sum;
    }
}

