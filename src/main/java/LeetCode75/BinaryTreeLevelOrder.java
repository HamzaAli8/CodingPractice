package LeetCode75;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrder {

    public List<List<Integer>> traverse (TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){

            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.data);

                if (currentNode.left != null)
                    queue.offer(currentNode.left);

                if (currentNode.right != null)
                    queue.offer(currentNode.right);
            }
                result.add(currentLevel);
        }
        return result;
    }


    public boolean checkSubarraySum(int[] nums, int k) {

        int windowSum = 0;
        int windowStart = 0;
        int i = 0;

        while (i < nums.length){

            windowSum += nums[i];

            if (windowSum == k) return true;

            if (k < windowSum){

                windowSum -= nums[windowStart];
                i++;
            }

            else {

                i++;
                windowSum += nums[i];
                if (windowSum == k) return true;
            }


        }

        return false;

    }

}

