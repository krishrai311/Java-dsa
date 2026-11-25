package src.Stack.leetcode;

import java.util.*;

public class  Removestar{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    Stack<Character> st=new Stack<>();
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);

      if(ch=='*'){
        st.pop();
      }
      else{
        st.push(ch);
      }
    }

    StringBuilder ans=new StringBuilder();
    while(!st.isEmpty()){
      ans.append(st.pop());
    }
    System.out.println(ans.reverse().toString());
  }
}