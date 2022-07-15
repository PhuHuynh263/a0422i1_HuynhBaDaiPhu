package ss3_array_and_method.exercise;

import java.util.Scanner;

public class TotalOneColumnInArray {
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

        //Nhập cột muốn tính
        int colum;
        do {
            System.out.print("Nhập cột muốn tính : ");
            colum = scanner.nextInt();
            if (colum > x) {
                System.out.println("Nhập sai!");
            }
        } while (colum > x);

        //Tổng 1 cột
        int result = 0;
        for (i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (j == colum) {
                    result += array[i][colum];
                    System.out.print(array[i][colum] + " ");
                }
            }
        }
        System.out.println("Tổng của cột " + colum + " là : " + result);
    }
}
