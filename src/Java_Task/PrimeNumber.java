package Java_Task;

public class PrimeNumber {
    public static void main(String[] args) {


        for (int j = 1; j <= 100; j++) {
            int flag = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    flag++;
                }
            }
            if (flag == 2) {
                System.out.print(j + " ");
            }
        }
    }
}

