
package Linklist;

public class Insertbegi {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    static Node head;
    static Node tail;

    public static void insert(int value){
        Node temp = new Node(value);

        if(head == null){
            head=temp;
            tail=temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
    }

    public static void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void insertAtLast(int value) {
        insert(value);
    }

    public static void main(String[] args) {

        insert(10);
        insert(20);
        insert(30);
        insertAtLast(40);

        display();
    }
}

