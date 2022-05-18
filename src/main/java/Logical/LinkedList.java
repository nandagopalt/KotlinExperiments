package Logical;

public class LinkedList {
    private Node head;

    public static LinkedList insert(LinkedList list, int data) {
        // Creating the new node with the data provided in the method argument and set the next part of node to null
        // as the next for the last node is null. Insertion to be happened in the end of the list.
        Node newNode = new Node(data);
        newNode.setNext(null);
        // List is empty or List is not having head
        if (list.head == null) {
            // Make the newNode created to point the head of the list
            list.head = newNode;
            // If the list is not empty and having few entries already
        } else {
            // Make the lastNode reference to point the list head
            Node lastNode = list.head;
            // Iterate till the last node [lastNode.next !=null]
            while (lastNode.getNext() != null) {

                lastNode = lastNode.getNext();
            }
            lastNode.setNext(newNode);
        }
        return list;
    }

}
