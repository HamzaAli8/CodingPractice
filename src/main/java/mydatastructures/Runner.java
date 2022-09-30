package mydatastructures;

public class Runner {

    public static void main(String[] args) {


        MyLinkedList linkedList = new MyLinkedList();

        linkedList.insert(6);
        linkedList.insert(5);
        linkedList.insert(3);


        linkedList.show();
        linkedList.reverse(linkedList);
        System.out.println();
        linkedList.show();

//        TreeNode root = null;
//        BinaryTree Btree = new BinaryTree();
//
//        root = Btree.insertNode(root,2);
//        root = Btree.insertNode(root, 1);
//        root = Btree.insertNode(root, 3);
//
//        Btree.invertTreeNode(root);



    }
}
