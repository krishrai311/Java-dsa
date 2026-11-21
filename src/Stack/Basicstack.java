import java.util.*;

public class Baiscstack{
    public static void main(String[] args){
      Stack<Integer> st=new Stack<>();
      System.out.println("Size is " + st.size());
      System.out.println(st);
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
      st.push(5);
      System.out.println(st);    //insert

      System.out.println(st.peek());   //top most see

      st.pop();
      System.out.println(st);  //remove at top element

      System.out.println(st.peek());

      System.out.println("Size is " + st.size());        //size

          //to find 0 index element then its used

      while(st.size()>1){
        st.pop();
      }
      System.out.println(st.peek());
      System.out.println(st);
    }
}