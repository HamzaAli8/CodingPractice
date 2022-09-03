package mydatastructures;

public class BinaryTree {


    private bNode createNewNode(int val) {

        bNode Node = new bNode();

        Node.data = val;
        Node.left = null;
        Node.right = null;
        return Node;
    }



    public bNode insertNode (bNode node, int val){

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




}
