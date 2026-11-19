package Linklist;
import java.util.*;

public class Nthnodefromend{
    public static Node nthNode(Node head,int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m=size-n+1;
        temp=head;
        for(int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;
    }

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args){
        Node a=new Node(100);
        Node b=new Node(16);
        Node c=new Node(10);
        Node d=new Node(40);
        Node e=new Node(5);
        Node f=new Node(67);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        Node q=nthNode(a,3);
        System.out.println(q.data);

        Node p=nthNode(a,4);
        System.out.println(p.data);
    }
}
