package Java_Task;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        int A[] = {-5, 1, -40, 20, 6, 8, 7};
        int K = 15;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<=A.length - 1;i++){
            if(arrayList.contains(K - A[i])){
                System.out.println("True");
            }
            arrayList.add(A[i]);

        }
        System.out.println("False");
    }
}
