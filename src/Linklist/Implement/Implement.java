package Linklist.Implement;

import java.util.*;
public class Implement{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(8);
        System.out.print(a.data + " ---> ");
        System.out.print(b.data  + " ---> ");
        System.out.print(c.data  + " ---> ");
        System.out.print(d.data  + " ---> ");
        System.out.print(d.next);
    }
}

