package LeetCode75;

import mydatastructures.Node;

public class MiddleLinkedList {

    public Node middleNode(Node head){

        Node temp = head;

        int length = 0;
        //Traversing temp till the end of linked list to find length #O(n)
        while (temp!= null){
            temp = temp.next;
            length++;
        }

        int middle = length/2;
        temp = head;
        //traversing temp node back to middle node #O(n/2)
        while(middle != 0){

            temp = temp.next;
            middle--;
        }

        return temp;
    }

    public Node middleNode2(Node head) {

        Node slow = head, fast = head;
        // slow moving 1 step at a time while fast is moving 2 steps at a time #O(N/2)
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


}
