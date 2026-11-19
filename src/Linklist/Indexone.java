package Linklist;
import java.util.*;

public class Indexone {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    public static class list{
        Node head=null;
        Node tail=null;

        public void atindex(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }

        public int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }


        public void index(int idx,int val){
            Node t=new Node(val);
            Node temp=head;

            if(idx==size()){
                atindex(val);
                return;
            }

            if(idx==0){
                atindex(val);
                return;
            }

            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + " ----> ");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args){
        list ll=new list();
        ll.atindex(2);
        ll.atindex(3);
        ll.atindex(4);
        ll.atindex(5);
        ll.atindex(6);


        ll.index(5,14);
        ll.display();

        System.out.println();

        System.out.println(ll.tail.data);
        System.out.println(ll.head.data);



    }
}
