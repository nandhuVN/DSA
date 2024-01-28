import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    // Method to insert a new node at the beginning of the linked list
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to print the linked list
    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

 class Main {
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();

        // Appending nodes to the linked list
        ll.append(2);
        ll.append(3);

        // Inserting a node at the beginning
        ll.prepend(1);
        ll.prepend(5);

        // Printing the linked list
        ll.printLinkedList();
    }
}
