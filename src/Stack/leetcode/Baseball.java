package src.Stack.leetcode;
import java.util.*;

public class Baseball {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String ops[]=new String [n];
    for(int i=0;i<n;i++){
      ops[i]=sc.next();
    }
    Stack<Integer> st=new Stack<>();
    for(int i=0;i<ops.length;i++){
      String number=ops[i];

      if(number.equals("+")){
        int val1=st.pop();
        int val2=st.pop();
        int val=val1+val2;

        st.push(val2);
        st.push(val1);
        st.push(val);
      }

      else if(number.equals("C")){
        st.pop();
      }

      else if(number.equals("D")){
        st.push(2*st.peek());
      }

      else{
        st.push(Integer.parseInt(number));
      }
    }

    int sum=0;
    while(st.size()>0){
      sum+=st.pop();
    }
    System.out.println(sum);
  }
}