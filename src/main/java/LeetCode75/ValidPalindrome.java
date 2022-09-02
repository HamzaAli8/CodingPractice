package LeetCode75;

public class ValidPalindrome {


    public String removeNonAlphaNumeric(String str){
        str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return str;
    }

    public boolean isPalindrome(String str){

        String str2 = removeNonAlphaNumeric(str);

        String reverse = "";

        boolean ans = false;

        for(int i = str2.length()-1; i >= 0; i--){
            reverse += str2.charAt(i);
        }

        if (str2.equals(reverse.toString())){
            ans = true;
        }

        return ans;
    }
}
