package Patterns;


public class Main {


    public static void main(String[] args) {

        SlidingWindow s = new SlidingWindow();

        int p = s.findMaxSubStringSum(new int[]{2,1,5,1,3,2},3);

        int t = s.findMaxSubStringSum2(new int[]{2,3,4,1,5},2);

        System.out.println(p);

    }

}


