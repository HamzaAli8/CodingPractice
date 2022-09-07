package Patterns;


import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        TwoPointers j = new TwoPointers();

        SlidingWindow s = new SlidingWindow();

        CyclicSort c = new CyclicSort();

        int y = s.maxProfit(new int [] {3,5,8,2,1,6});

        int p = s.findMaxSubStringSum(new int[]{2,1,5,1,3,2},3);

        int t = s.findMaxSubStringSum2(new int[]{2,3,4,1,5},2);

        int q = s.findMinSubArray(new int[]{2,1,5,2,3,2},5);

//        s.romanToInt("MCMXCIV");
//
//        int[]  arr = {1,2,3,4,6};
//
//        int[] arr2 = j.pairWithTargetSum3(arr, 6);

//        System.out.println(Arrays.toString(arr2));

//        System.out.println(y);


//        int nonDuplicates =  j.removeDuplicates(new int [] {1,1,3,4,5,6,6,6,6,7,7});

//        arr = new int[] {1,5,6,4,3,2};
//
//        c.cyclicSort1(arr);
//
//        for (int num : arr){
//
//            System.out.print(num + " ");
//        }

//        arr = new int[] {0,5,3,1,2};
//
//        int v = c.findMissingNumber(arr);



////        List<Integer> duplicates = c.findAllDuplicates(new int[] {2,4,6,8,2,3,5,1});
//
//        Integer duplicate = c.FindDuplicate(new int[] {2,4,6,8,2,3,5,1});
//
////        List<Integer> duplicateAndMissing =
////                c.findMissingAndDuplicate(new int[] {3,1,2,3,6,4});
//
//        List<Integer> missingSmallestNum =
//                c.findSmallestMissingPositiveNum(new int[] {-3,1,5,4,2});

        Practice newP = new Practice();

//        int b = s.FindLongestSubstringDistinctChar("araaci", 2);
//
//        int f = newP.FindMaxSubstringWithDistinctChar("araaci", 2);
//
//        int g = newP.FindMaxSubArray(new int[] {2,3,4,5,3,1}, 2);

        int [] arr = newP.sort(new int[] {5,4,2,3,1});

        String str = "formation";

        String str1 = str.substring(1,5);

        System.out.println(str1);

//        System.out.println(Arrays.toString(arr));
////        System.out.println(b);






    }



}



