package swea;

import java.util.Scanner;

public class _2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iter = sc.nextInt();

        int number = 1;
        System.out.printf("%d ", number);
        for (int i = 0; i < iter; i++) {
            number *= 2;
            System.out.printf("%d ", number);
        }
    }
}
