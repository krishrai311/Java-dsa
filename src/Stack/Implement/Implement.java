import java.util.*;

public class Implement {
  public static class Stack{
    int arr[]=new int[6];
    int idx=0;
    public void push(int x){
      if(isFull()){
        System.out.println("Stack is full");
        return;
      }
      arr[idx]=x;
      idx++;
    }

    public int peek(){
      if(idx==0){
        System.out.println("Stack is Empty");
        return -1;
      }
      return arr[idx-1];
    }

    public int pop(){
      if(idx==0){
        System.out.println("Stack is Empty");
        return -1;
      }
      int top=arr[idx-1];
      arr[idx-1]=0;
      idx--;
      return top;
    }

    public void display(){
      for(int i:arr){
        System.out.print(i + " ");
      }
      System.out.println();
    }

    public int size(){
      return idx;
    }

    public boolean isEmpty(){
      if(idx==0){
        return true;
      }
      else{
        return false;
      }
    }

    public int capacity(){
      return arr.length;
    }

    public boolean isFull(){
      if(idx==arr.length){
        return true;
      }
      else{
        return false;
      }
    }
  }
  public static void main(String[] args) {
    Stack st=new Stack();
    st.push(4);
    st.push(5);
    st.push(1);
    st.display();

    System.out.println();
    System.out.print("Size " + st.size());

    System.out.println();
    st.pop();
    st.display();
    System.out.print(st.size());
  }
}