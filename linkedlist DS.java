import java.util.*;
// syntax format for node
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
// syntax format for linked list
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
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }
}

public class Main {
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();

        // Appending nodes to the linked list
        ll.append(1);
        ll.append(2);
        ll.append(3);

        // Printing the linked list
        printLinkedList(ll.head);
    }

    // Method to print the linked list
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
