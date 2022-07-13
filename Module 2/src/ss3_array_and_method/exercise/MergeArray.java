package ss3_array_and_method.exercise;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, index, size1, size2;
        int[] array1;
        int[] array2;
        int[] array3;
        //Số lượng phần tử mảng 1
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            size1 = scanner.nextInt();
        } while (size1 <= 0);
        //Số lượng phần tử mảng 2
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            size2 = scanner.nextInt();
        } while (size2 <= 0);
        //Nhập phần tử mảng 1
        array1 = new int[size1];
        System.out.println("Nhập các phần tử cho mảng 2: ");
        for (i = 0; i < size1; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array1[i] = scanner.nextInt();
        }
        //Nhập phần tử mảng 2
        array2 = new int[size2];
        System.out.println("Nhập các phần tử cho mảng 1: ");
        for (i = 0; i < size2; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array2[i] = scanner.nextInt();
        }
    }
}
