package src.Stack.leetcode;
import java.util.*;
public class Removealladjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
          char ch=s.charAt(i);

          if(st.isEmpty()){
            st.push(ch);
          }
          else if(st.peek()==ch){
            st.pop();
          }
          else{
            st.push(ch);
          }
        }

        StringBuffer ans=new StringBuffer();
        while(!st.isEmpty()){
          ans.append(st.pop());
        }
        System.out.println(ans.reverse().toString());
    }
}