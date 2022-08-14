import java.util.*;

public class Main {


    public static boolean isAnagram(String s, String t ){

        if (s.length() != t.length()){

            return false;
        }

        else{

            char [] str1Array = s.toCharArray();
            char [] str2Array = t.toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            return Arrays.equals(str1Array, str2Array);
        }
    }

    public static boolean isPalindrome(int x) {

        int reversedNum = 0;

        int remainder;

        // store the number to originalNum
        int originalNum = x;


        // get the reverse of originalNum
        // store it in variable
        while (x > 0) {
            remainder = x % 10;
            reversedNum = reversedNum * 10 + remainder;
            x /= 10;
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {

            System.out.println(originalNum + " is Palindrome.");
            return true;

        }
        else {
            System.out.println(originalNum + " is not Palindrome.");
            return false;
        }
    }


    public static boolean isAnagram2(String str1, String str2){

        Map<Character, Integer> str1Map = new HashMap<>();
        Map<Character, Integer> str2Map = new HashMap<>();

        Character ch;

        for (int i = 0; i < str1.length(); i++){

            ch = str1.charAt(i);

            if(str1Map.get(ch) == null){
                str1Map.put(ch,1);
            } else str1Map.put(ch, str1Map.get(ch) + 1);
        }

        for (int i = 0; i < str1.length(); i++){

            ch = str2.charAt(i);

            if(str2Map.get(ch) == null)
                str2Map.put(ch,1);
            else str2Map.put(ch, str2Map.get(ch) + 1);
        }

        return  str1Map.equals(str2Map);

    }


    public static boolean areTheyEqual(int x , int y){

        return x == y;
    }


    public static void getKeys(){

        Map<String, String> myMap= new HashMap<>();

        myMap.put("Hamza", "nosebone");
        myMap.put("Mohammud", "tremoose");
        myMap.put("Ahmed", "Fade");

        Set<String> keys = myMap.keySet();


        Set<Map.Entry<String, String>> entrySet = myMap.entrySet();

        for(Map.Entry<String, String> f : entrySet ){

            System.out.println(f.getKey());
            System.out.println(f.getValue());
        }

//        for (String i: keys){
//
//            System.out.println(myMap.get(i));
//        }

//        System.out.println(myMap.get("Hamza"));
//        System.out.println(myMap.get("Ali"));


    }

    public static void main(String[] args) {

//        isPalindrome(121);
//        isPalindrome(2442);



//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("please enter string 1:");
//
//        String str1 = sc.nextLine();
//
//        System.out.println("please enter string 2:");
//
//        String str2 = sc.nextLine();

//        System.out.println(isAnagram(str1,str2));

//        System.out.println(isAnagram2(str1, str2));

//        getKeys();

//        Stack nums = new Stack();
//
//        nums.push(15);
//        nums.push(8);
//        nums.push(10);
//
//        nums.pop();
//
//        nums.show();


//        List<String> names = new ArrayList<>();
//
//        names.add("Hamza");
//        names.add("Hamza1");
//        names.add("Hamza2");
//        names.add("Hamza3");
//        names.add("Hamza4");
//
//
//
//        System.out.println(names);
//
//
//        names.remove(2);
//
//
//        System.out.println(names);
//        System.out.println(areTheyEqual(121,121));

        isPalindrome(121);






    }

}


