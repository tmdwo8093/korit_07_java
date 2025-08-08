package ch06_condition;

import java.util.Scanner;

/*
    중첩 if문(Nested - if)
        if문 내에 if문이 중첩적으로 사용 될 수 있스빈다.
    형식 :
    if(조건식1) {
        실행문1
        if(조건식1a) {
            실행문1a
        } else if(조건식1b) {
            실행문1b
        } else if(조건식1c) {
            실행문1c
        } else {
            실행문 1d
        }
    if(조건식2) {
        실행문2
        if(조건식2a) {
            실행문2a
        } else if(조건식2b) {
            실행문2b
        } else if(조건식2c) {
            실행문2c
        } else {
            실행문 2d
        }

 */
public class Condition07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String grade = "";
        System.out.println("점수를 입력하세요 >>> ");
        score = scanner.nextInt();

        // 중첩 if문을 활용한 grade 대입
        if (score > 100 || score < 0) {
            System.out.println("불가능한 점수 입력입니다.");   // 실행문 1
            grade = "X";
        } else {
            if (score > 89) {
                grade = "A";
            } else if (score > 79) {
                grade = "B";
            } else if (score > 69) {
                grade = "C";
            } else if (score > 59) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("당신의 점수는 " + score + "점이고," + " 학점은 " + grade + "입니다.");
        }

        }
    }
