package Java_Task;


import java.util.Scanner;

public class StringCountOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String find_s = sc.nextLine();
        System.out.println(s.split(find_s,-1).length-1);
    }
}
