package Java_Task;

import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        int count = 0;
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i) == ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
