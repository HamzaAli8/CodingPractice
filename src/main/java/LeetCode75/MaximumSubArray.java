package LeetCode75;

public class MaximumSubArray {

    int windowSum = 0, maxSum = 0;


    public int maxSubArray(int[] nums) {

        int windowSum = 0;
        int maxSum = nums[0];

        for (int i : nums) {

            if (windowSum < 0){
                windowSum = 0;
            }
            windowSum += i;
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
