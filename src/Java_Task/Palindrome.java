package Java_Task;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        String rev= "";
        for(int i=s.length() - 1;i>=0;i--){
            rev += s.charAt(i);

        }
        if(s.equals(rev)){
            System.out.println(s + " String is Palindrome");
        }else {
            System.out.println(s + " String is not a Palindrome");
        }

    }
}
