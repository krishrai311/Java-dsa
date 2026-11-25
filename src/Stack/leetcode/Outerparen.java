package src.Stack.leetcode;
import java.util.*;

public class Outerparen {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    Stack<Character> st=new Stack<>();
    StringBuilder ans =new StringBuilder();
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);

      if(ch== '('){
        if(!st.isEmpty()){
          ans.append('(');
        }
        st.push(ch);
      }

      else{
        st.pop();
        if(!st.isEmpty()){
          ans.append(')');
        }
      }
    }
    System.out.print(ans.toString());
  }
}

