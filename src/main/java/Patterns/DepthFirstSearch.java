package Patterns;

public class DepthFirstSearch {



    public boolean hasPath(TreeNode root, int sum){

        if (root == null)
            return false;

        if (root.val == sum && root.left == null && root.right == null)
            return true;

        return hasPath(root.left, sum - root.val) || hasPath(root.right, sum - root.val);
    }

    public int maxDepth(TreeNode root){
        if (root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
        }
    }

