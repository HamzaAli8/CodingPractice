package Patterns;

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


}
