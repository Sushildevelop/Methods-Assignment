package Practice.Methods.Assignment;

import java.util.Scanner;

public class Middle_String {
    public static String middle(String s){
        if(s.length()%2==0){
             return s.substring(s.length()/2,s.length()/2+2);
        }
        else{
             return s.substring(s.length()/2,s.length()/2+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println(middle(s));
    }
}
