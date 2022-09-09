package mydatastructures;

public class BinaryTree {


    private TreeNode createNewNode(int val) {

        TreeNode TreeNode = new TreeNode();

        TreeNode.data = val;
        TreeNode.left = null;
        TreeNode.right = null;
        return TreeNode;
    }



    public TreeNode insertNode (TreeNode node, int val){

        if (node == null){
            return createNewNode(val);
        }

        else if (val < node.data){
            node.left = insertNode(node.left,val);
        }

        else if (val > node.data){
            node.right = insertNode(node.right,val);
        }

        return node;
    }

    public TreeNode invertTreeNode(TreeNode root){

        if (root == null)
            return root;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }




}
