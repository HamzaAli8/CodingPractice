package Patterns;



public class TwoPointers {

    // brute force method

    public int[] pairWithTargetSum(int [] arr, int sum){

        int [] output = new int[2];

        for(int i = 0; i < arr.length -1; i++){

            int low = 0;
            int high = arr.length -1;

            while(low <= high){

                int mid = (high + low)/2;

                if (arr[mid] + arr[i] < sum) low = mid +1;
                else if (arr[mid] + arr[i] > sum) high = mid -1;
                else{
                    return new int[] {i , mid};
                }
            }
        }

        return output;
    }


// same method as above but using 2 pointer method

    public int[] pairWithTargetSum2(int [] arr, int sum){

        int left = 0, right = arr.length -1;

        while (left < right ){

            int currentSum = arr[left] + arr[right];
            if (currentSum == sum){
                return new int[] {left , right};
            }

            if (sum > currentSum)
                left ++;
            else
                right--;
        }
    return new int [] {-1, -1};
    }

}
