package ss3_array_and_method.exercise;

import java.util.Scanner;

public class CountCharacterInString {
    public static void main(String[] args) {
        String str = "Hello World";
        char character;
        Scanner scanner = new Scanner(System.in);
        System.out.println(str);
        System.out.print("Nhập ký tự : ");
        character = scanner.nextLine().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count = count + 1;
            }
        }
        System.out.println("Có " + count + " lần ký tự '" + character + "' xuất hiện trong chuỗi " + str);
    }
}
