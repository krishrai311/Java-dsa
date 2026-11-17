package src.Bubble.Linear;

import java.util.*;
public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==b){
                count=1;
                break;
            }
        }
        if(count==1){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
    }
}
