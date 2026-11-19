package Linklist.Implement;

import java.util.*;

public class Basicone{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args){
        Node a=new Node(10);
        System.out.println(a);
        System.out.println(a.data);
        System.out.println(a.next);

    }
}

