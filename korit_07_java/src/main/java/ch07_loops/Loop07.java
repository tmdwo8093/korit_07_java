package ch07_loops;

import java.util.Scanner;

/*
  Scanner를 이용한 별찍기

  몇 줄의 별을 생성하시겠습니까? >>> 3
 */
public class Loop07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = 0;
        System.out.print("몇 줄의 돌고래를 생성하시겠습니까? >>> ");
        row = scan.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("🐬");
            }
            System.out.println();
        }
        System.out.println();


        Scanner scan2 = new Scanner(System.in);
        int column = 0;
        System.out.print("몇 줄의 닌자를 소환 하시겠습니까? >>> ");
        column = scan2.nextInt();
        for (int i = 0; i < column; i++) {
            for (int j = column; j > i; j--) {
                System.out.print("🥷");
            }
            System.out.println();
        }
        System.out.println();
    }
}
