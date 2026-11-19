package Linklist.Implement;
public class Function{

public static class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " --> ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
    }
}

