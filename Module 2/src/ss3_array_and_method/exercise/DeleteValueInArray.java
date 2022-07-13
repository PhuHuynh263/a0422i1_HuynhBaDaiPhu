package ss3_array_and_method.exercise;

import java.util.Scanner;

public class DeleteValueInArray {
    public static void main(String[] args) {
        int size, index, i;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            size = scanner.nextInt();
        } while (size <= 0);

        array = new int[size];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();

        for (index = i = 0; i < size; i++) {
            if (array[i] != k) {
                array[index] = array[i];
                index++;
            }
        }
        array[size - 1] = 0;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
