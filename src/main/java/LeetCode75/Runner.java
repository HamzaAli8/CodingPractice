package LeetCode75;

public class Runner {

    public static void main(String[] args) {

        ValidPalindrome valid = new ValidPalindrome();

        String s = "A man, a plan, a canal: Panama";

        Boolean t = valid.isPalindrome(s);

        System.out.println(t);

    }
}
