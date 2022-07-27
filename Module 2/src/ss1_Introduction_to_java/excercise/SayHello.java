package ss1_introduction_to_java.baitap;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = Scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}
