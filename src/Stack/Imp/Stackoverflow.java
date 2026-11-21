
import java.util.*;

public class Main{
  public static class Stackoverflow{
    int arr[]=new int[6];
    int idx=0;
    public void push(int x){

      if(idx==arr.length){
        System.out.println("Stack is full");
        return;
      }
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
    Stackoverflow st=new Stackoverflow();  //Stack is full its not give error
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.push(6);
    st.push(7);

    st.display();
  }
}