package ss1_introduction_to_java.baitap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.println("Nhập số tiền USD: ");
        usd = scanner.nextDouble();
        double result = usd * vnd;
        System.out.println("Giá trị VND: " + result);
    }
}
