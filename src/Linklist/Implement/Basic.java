package Linklist.Implement;

class Node{
    int data;   //value
    Node next;  //address of new node
}

public class Basic{
    public static void main(String[] args){
        Node a=new Node();
        System.out.println(a.data);
        System.out.println(a);
        System.out.println(a.next);
    }
}
