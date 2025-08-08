package ch06_condition;

import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        /*
            사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.
            score가 90점 이상이라면 grade는 A
            score가 80점 이상이라면 grade는 B
            score가 70점 이상이라면 grade는 C
            score가 60점 이상이라면 grade는 D
            score가 50점 이하라면 grade는 F

            실행 예
            점수를 입력하세요 >>> 68
            당신의 점수는 68점이고, 학점은 D입니다.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요 >>> ");
        int score = scanner.nextInt();
        String userScore = "";

        if (score > 89) {
            userScore = "A";
        } else if (score > 79) {
            userScore = "B";
        } else if (score > 69) {
            userScore = "C";
        } else if (score > 59) {
            userScore = "D";
        } else {
            userScore = "F";
        }
        System.out.println("당신의 점수는 " + score + "점이고," + " 학점은 " + userScore + "입니다.");
    }
    }

