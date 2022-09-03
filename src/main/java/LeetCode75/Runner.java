package LeetCode75;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        ValidPalindrome valid = new ValidPalindrome();
//
//        String s = "A man, a plan, a canal: Panama";
//
//        Boolean t = valid.isPalindrome(s);

//        BinarySearch bs = new BinarySearch();
//
//        int b = bs.binarySearch(new int[]  {-1,0,3,5,9,12},100);

          MaximumSubArray max = new MaximumSubArray();

        int m = max.maxSubArray(new int [] {-2,1,-3,4,-1,2,1,-5,4});

        System.out.println();


        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);


        BinaryTreeLevelOrder btl = new BinaryTreeLevelOrder();

        List<List<Integer>> result = btl.traverse(root);

        System.out.println("Level Order Traversal: " + result );



    }
}
