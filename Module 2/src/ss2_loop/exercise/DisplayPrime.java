package ss2_loop.exercise;

import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = scanner.nextInt();
        int count = 0;
        int N = 2;
        int dem = 0;
        while (count < number) {
            dem = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    dem = dem + 1;
                }
            }
            if (dem == 2) {
                System.out.print(N + "\t");
                count++;
            }
            N++;
        }
    }
}
