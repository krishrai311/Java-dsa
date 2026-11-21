
import java.util.*;

public class Push{
  public static class Stack{
    int arr[]=new int[5];
    int idx=0;
    public void push(int x){
      arr[idx]=x;
      idx++;
    }

    public void display(){
      for(int i:arr){
        System.out.print(i + " ");
      }
    }
  }

  public static void main(String[] args){
    Stack st=new Stack();
    st.push(1);    //length 7 push then its error 
    st.push(2);
    st.push(3);
    st.push(4);

    st.display();
  }
}