package Java_Task;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.print("String after removing vowels is : ");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                continue;
            }else {
                System.out.print(s.charAt(i));
            }
        }
    }
}
