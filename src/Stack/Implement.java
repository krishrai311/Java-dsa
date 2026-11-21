
import java.util.*;

public class Implement {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(st.isEmpty());
      Stack<Integer> st=new Stack<>();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        st.push(arr[i]);
      }
      System.out.println(st);
      System.out.println(st.peek());
      st.pop();
      System.out.println(st);
      System.out.println(st.size());
      System.out.println(st.isEmpty());
    }
}