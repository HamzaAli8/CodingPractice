package mydatastructures;

public class MyLinkedList {

    Node head;

    public void insert (int data){

        Node addedNode = new Node();

        addedNode.data = data;
        addedNode.next = null;

        if (head == null){

            head = addedNode;
        }
        else {

            Node current = head;

            while(current.next != null){
                current = current.next;
            }
            current.next = addedNode;
        }
    }

    public void show(){

        Node printNode = head;

        while(printNode.next != null){

            System.out.println(printNode.data);
            printNode = printNode.next;
        }
        System.out.println(printNode.data);
    }


}
