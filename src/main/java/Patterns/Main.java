package Patterns;



public class Main {


    public static void main(String[] args) {

        TwoPointers j = new TwoPointers();

        SlidingWindow s = new SlidingWindow();

        int y = s.maxProfit(new int [] {3,5,8,2,1,6});

        int p = s.findMaxSubStringSum(new int[]{2,1,5,1,3,2},3);

        int t = s.findMaxSubStringSum2(new int[]{2,3,4,1,5},2);

        int q = s.findMinSubArray(new int[]{2,1,5,2,3,2},5);

        s.romanToInt("MCMXCIV");

        int[]  arr = {1,2,3,4,6};

        int[] arr2 = j.pairWithTargetSum3(arr, 6);

//        System.out.println(Arrays.toString(arr2));

//        System.out.println(y);


        int nonDuplicates =  j.removeDuplicates(new int [] {1,1,3,4,5,6,6,6,6,7,7});

        System.out.println(nonDuplicates);
    }



}



