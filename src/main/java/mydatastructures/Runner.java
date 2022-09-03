package mydatastructures;

public class Runner {

    public static void main(String[] args) {


//        MyLinkedList linkedList = new MyLinkedList();
//
//        linkedList.insert(6);
//        linkedList.insert(5);
//        linkedList.insert(3);
//        linkedList.insertAtStart(7);
//
//        linkedList.show();
//        linkedList.reverse(linkedList);
//        System.out.println();
//        linkedList.show();

        bNode root = null;
        BinaryTree Btree = new BinaryTree();

        root = Btree.insertNode(root,8);
        root = Btree.insertNode(root, 11);
        root = Btree.insertNode(root, 9);
        root = Btree.insertNode(root, 7);
        root = Btree.insertNode(root, 17);


    }
}
