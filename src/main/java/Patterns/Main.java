package Patterns;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {

        TwoPointers j = new TwoPointers();

        SlidingWindow s = new SlidingWindow();

        int y = s.findMaxSubStringSum3(new int [] {7,1,5,3,6,4});

        int p = s.findMaxSubStringSum(new int[]{2,1,5,1,3,2},3);

        int t = s.findMaxSubStringSum2(new int[]{2,3,4,1,5},2);

        int q = s.findMinSubArray(new int[]{2,1,5,2,3,2},5);

        s.romanToInt("MCMXCIV");

        int[]  arr = {2,5,9,11};

//        int arr2 [] = j.pairWithTargetSum2(arr, 11);

//        System.out.println(Arrays.toString(arr2));

        System.out.println(y);







    }

}



