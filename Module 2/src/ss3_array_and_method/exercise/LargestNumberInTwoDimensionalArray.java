package ss3_array_and_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumberInTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, x, y;
        int[][] array;


        //Nhập số hàng
        do {
            System.out.print("Nhập vào số hàng của mảng: ");
            x = scanner.nextInt();
        } while (x <= 0);

        //Nhập số cột
        do {
            System.out.print("Nhập vào số cột của mảng : ");
            y = scanner.nextInt();
        } while (y <= 0);

        //Nhập phần tử mảng 2 chiều
        array = new int[x][y];
        for (i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Nhập phần tử hàng " + i + " cột " + j + " là: ");
                array[i][j] = scanner.nextInt();
            }
        }

        //Xuất ra mảng 2 chiều
        for (i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        //Tìm giá trị lớn nhất trong mảng 2 chiều
        int max = array[0][0];
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array[j].length; k++) {
                if (array[j][k] > max) {
                    max = array[j][k];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng 2 chiều trên là : " + max);
    }
}
