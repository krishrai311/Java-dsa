package src.Stack.leetcode;
import java.util.*;
public class Backspacestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
          char ch=s.charAt(i);
          if(ch=='#'){
            if(!st1.isEmpty()){
              st1.pop();
            }
          }
          else{
            st1.push(ch);
          }
        }

        for(int i=0;i<t.length();i++){
          char chh=t.charAt(i);

          if(chh=='#'){
            if(!st2.isEmpty()){
              st2.pop();
            }
          }
          else{
            st2.push(chh);
          }
        }
        System.out.println(st1.equals(st2));
    }
}