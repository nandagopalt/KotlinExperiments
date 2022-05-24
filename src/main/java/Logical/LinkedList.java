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

    public static void printList(LinkedList list) {
        System.out.println("Elements in the list are :");
        Node lastNode = list.head;
        while (lastNode != null) {
            System.out.println(lastNode.getData());
            lastNode = lastNode.getNext();
        }
    }

    public static LinkedList deleteItem(LinkedList list, int element) {
        Node currentNode = list.head;
        Node previousNode = null;
        if (currentNode != null && currentNode.getData() == element) {
            list.head = currentNode.getNext();
            System.out.println("Element " + element + " found and deleted");
            return list;
        }
        while (currentNode != null && currentNode.getData() != element) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (currentNode != null) {
            previousNode.setNext(currentNode.getNext());
            System.out.println("Element " + element + " found and deleted");
        }
        if (currentNode == null) {
            System.out.println("Element " + element + " not found");
        }
        return list;
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        insert(list, 3);
        insert(list, 1);
        insert(list, 2);
        printList(list);
        deleteItem(list, 2);
        printList(list);
    }

}
