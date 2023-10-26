package Java_Task;

import java.util.HashSet;

public class ArraySubset {
    public static void main(String[] args) {
        int[] A = {3, 5, 7, 12, 1, 9, 10, 0, 2};
        int[] B1 = {1, 3, 5, 9};
        int[] B2 = {6, 3, 8};

        boolean result1 = isSubset(A, B1);
        boolean result2 = isSubset(A, B2);

        System.out.println(result1);
        System.out.println(result2);
    }


    public static boolean isSubset(int[] A, int[] B) {
        HashSet<Integer> setA = new HashSet<>();
        for (int num : A) {
            setA.add(num);
        }


        for (int num : B) {
            if (!setA.contains(num)) {
                return false;
            }
        }

        return true;
    }


}


