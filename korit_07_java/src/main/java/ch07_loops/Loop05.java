package ch07_loops;

import java.util.Scanner;

/*
    중첩 for문도 가능합니다
    for (int i = 0 ; i < 100 ; i++) {
        반복실행문1-a
        for(int j = 0 ; j < 100 ; j++) {
            반복실행문2
        }
        반복실행문1-b
    }
    for문을 활용하여 1일차 1교시입니다. ~ 5일차 3교시입니다 까지 출력하시오
 */
public class Loop05 {
    public static void main(String[] args) {
//        for (int day = 1; day < 6; day++)
//        for (int lesson = 1; lesson < 4; lesson++) {
//            System.out.println(day + "일차 " + lesson + "교시입니다.");
//        }
//    }

//        for (int i = 2; i < 10; i++) {
//            System.out.print(i + "단\t\t\t");
//        }
//
//        System.out.println();
//
//        for (int i = 1; i < 10; i++) {
//            for (int j = 2; j < 10; j++) {
//                System.out.print(j + " X " + i + " = " + (j*i) + "\t");
//            }
//            System.out.println();
//        }
        for (int k = 0; k < 101; ++k){
            System.out.print(k + " ");
            if (k % 10 == 0) {
                System.out.println();
            }
        }
//
//        for (int j = 1; j < 101; j+=10) {
//            System.out.println(j + " " + (j+1)+ " " + (j+2)+ " " + (j+3)+ " " + (j+4)+ " " + (j+5)
//                    + " " + (j+6)+ " " + (j+7)+ " " + (j+8)+ " " + (j+9));
//        }
//        Scanner scanner = new Scanner(System.in);
//        int sum4 = 0;
//
//        System.out.println("1부터 몇 까지 더하시겠습니까? >>> ");
//        int n = scanner.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            sum4 += i;
//        }
//        System.out.println("1부터 " + n + "까지의 합은 " + sum4 +" 입니다.");
    }
}
