package LeetCode75;

public class Runner {

    public static void main(String[] args) {

//        ValidPalindrome valid = new ValidPalindrome();
//
//        String s = "A man, a plan, a canal: Panama";
//
//        Boolean t = valid.isPalindrome(s);

        BinarySearch bs = new BinarySearch();

        int b = bs.binarySearch(new int[]  {-1,0,3,5,9,12},100);

        System.out.println(b);

    }
}
