
import java.util.*;

public class PeekImp{
  public static class Stackoverflow{
    int arr[]=new int[6];
    int idx=0;
    public int peek(){
      if(idx==0){
        System.out.println("Stack is Empty");
        return -1;
      }
      return arr[idx-1];
    }

    public void display(){
      for(int i:arr){
        System.out.print(i + " ");
      }
    }
  }

  public static void main(String[] args){
    Stackoverflow st=new Stackoverflow();
    st.arr[0]=1;
    st.arr[1]=2;
    st.arr[2]=3;
    st.idx=3;
    System.out.println(st.peek());
  }
}