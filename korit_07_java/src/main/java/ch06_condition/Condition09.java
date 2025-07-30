package ch06_condition;

import java.util.Scanner;

/*

        논리 연산자를 이용한 풀이
 */
public class Condition09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("연도를 입력하시오 >>> ");
        int year = scanner.nextInt();
        String leapYear = "윤년입니다";

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        } else {
            leapYear = "윤년이 아닙니다.";
        }
    }
}
