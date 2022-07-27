package ss1_introduction_to_java.baitap;

import java.util.Scanner;

public class SpeakNumber {
    public static void main(String[] args) {
        int number;
        String result = "";
        Scanner scanner = new Scanner(System.in);
//        Nhập số
        do {
            System.out.print("Enter a number for read (0 < number < 1000): ");
            number = scanner.nextInt();
            if (number < 0 || number > 999) {
                System.out.println("Input error - Enter again");
            }
        } while (number < 0 || number > 999);

//        Main
        if (number < 10) { // 0 < number < 10
            switch (number) {
                case 0:
                    result += "zero";
                    break;
                case 1:
                    result += "one";
                    break;
                case 2:
                    result += "two";
                    break;
                case 3:
                    result += "three";
                    break;
                case 4:
                    result += "four";
                    break;
                case 5:
                    result += "five";
                    break;
                case 6:
                    result += "six";
                    break;
                case 7:
                    result += "seven";
                    break;
                case 8:
                    result += "eight";
                    break;
                case 9:
                    result += "nine";
                    break;
            }
        } else if (number < 20) { // 10 <= number < 20
            switch (number) {
                case 11:
                    result += "eleven";
                    break;
                case 12:
                    result += "twelve";
                    break;
                case 13:
                    result += "thirteen";
                    break;
                case 14:
                    result += "forteen";
                    break;
                case 15:
                    result += "fifteen";
                    break;
                case 16:
                    result += "sixteen";
                    break;
                case 17:
                    result += "seventeen";
                    break;
                case 18:
                    result += "eighteen";
                    break;
                case 19:
                    result += "nineteen";
            }
        } else if (number < 100) { // 20 <= number < 100
            int unitNumber = number % 10; //chữ số hàng đơn vị
            int dozensNumber = (number / 10); //chữ số hàng chục
            switch (dozensNumber) {
                case 2:
                    result += "twenty";
                    break;
                case 3:
                    result += "thirty";
                    break;
                case 4:
                    result += "fourty";
                    break;
                case 5:
                    result += "fifty";
                    break;
                case 6:
                    result += "sixty";
                    break;
                case 7:
                    result += "seventy";
                    break;
                case 8:
                    result += "eightty";
                    break;
                case 9:
                    result += "ninety";
                    break;
            }
            if (unitNumber != 0) {
                String unitNumberRead = "";
                switch (unitNumber) {
                    case 1:
                        unitNumberRead += "one";
                        break;
                    case 2:
                        unitNumberRead += "two";
                        break;
                    case 3:
                        unitNumberRead += "three";
                        break;
                    case 4:
                        unitNumberRead += "four";
                        break;
                    case 5:
                        unitNumberRead += "five";
                        break;
                    case 6:
                        unitNumberRead += "six";
                        break;
                    case 7:
                        unitNumberRead += "seven";
                        break;
                    case 8:
                        unitNumberRead += "eight";
                        break;
                    case 9:
                        unitNumberRead += "nine";
                        break;
                }
                result += " " + unitNumberRead;
            }
        } else {
            int unitNumber = number % 10; //chữ số hàng đơn vị
            int dozensNumber = (number / 10) % 10; //chữ số hàng chục
            int hundredsNumber = number / 100; //chữ số hàng trăm
            switch (hundredsNumber) {
                case 1:
                    result += "one";
                    break;
                case 2:
                    result += "two";
                    break;
                case 3:
                    result += "three";
                    break;
                case 4:
                    result += "four";
                    break;
                case 5:
                    result += "five";
                    break;
                case 6:
                    result += "six";
                    break;
                case 7:
                    result += "seven";
                    break;
                case 8:
                    result += "eight";
                    break;
                case 9:
                    result += "nine";
                    break;
            }
            result += " hundred";
            if (dozensNumber != 0) {
                String dozensNumberRead = "";
                String unitNumberRead = "";
                switch (dozensNumber) {
                    case 1:
                        switch (unitNumber) {
                            case 3:
                                result += " three";
                                break;
                            case 4:
                                result += " four";
                                break;
                            case 5:
                                result += " five";
                                break;
                            case 6:
                                result += " six";
                                break;
                            case 7:
                                result += " seven";
                                break;
                            case 8:
                                result += " eight";
                                break;
                            case 9:
                                result += " nine";
                                break;
                        }
                        if (unitNumber == 1) {
                            result += "eleven";
                        } else if (unitNumber == 2) {
                            result += "twelve";
                        } else if (unitNumber == 0) {
                            result += "ten";
                        } else {
                            result += "teen";
                        }
                        break;
                    case 2:
                        dozensNumberRead += "twenty";
                        break;
                    case 3:
                        dozensNumberRead += "thirty";
                        break;
                    case 4:
                        dozensNumberRead += "fourty";
                        break;
                    case 5:
                        dozensNumberRead += "fifty";
                        break;
                    case 6:
                        dozensNumberRead += "sixty";
                        break;
                    case 7:
                        dozensNumberRead += "seventy";
                        break;
                    case 8:
                        dozensNumberRead += "eightty";
                        break;
                    case 9:
                        dozensNumberRead += "ninety";
                        break;
                }
                result += " " + dozensNumberRead;

                switch (unitNumber) {
                    case 1:
                        unitNumberRead += "one";
                        break;
                    case 2:
                        unitNumberRead += "two";
                        break;
                    case 3:
                        unitNumberRead += "three";
                        break;
                    case 4:
                        unitNumberRead += "four";
                        break;
                    case 5:
                        unitNumberRead += "five";
                        break;
                    case 6:
                        unitNumberRead += "six";
                        break;
                    case 7:
                        unitNumberRead += "seven";
                        break;
                    case 8:
                        unitNumberRead += "eight";
                        break;
                    case 9:
                        unitNumberRead += "nine";
                        break;
                }
                if (dozensNumber != 1) {
                    result += " " + unitNumberRead;
                }
            }
        }
        System.out.println(result);
    }
}
