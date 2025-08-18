package org.example.test;
/*

    [요구 사항]
    2. 수강생 조회:
        - 학번을 입력받아, Map에서 해당 학번의 학생 이름을 찾아 출력합니다.
        - 없는 학번이라면, "해당 학번의 수강생이 없습니다."라고 출력합니다.
    3. 수강생 수정:
        - 수정할 학번을 입력받아, 해당 학번이 존재하는지 확인합니다.
        - 존재한다면, 새로운 이름을 입력받아 해당 학번의 학생 이름을 수정합니다.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> studentMap = new HashMap<>();

        while (true) {
            System.out.println("\n--- 수강생 관리 프로그램 ---");
            System.out.println("1. 수강생 등록");
            System.out.println("2. 수강생 조회");
            System.out.println("3. 수강생 이름 수정");
            System.out.println("4. 전체 수강생 보기");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("학번을 입력하세요 : ");
                    Integer StudentId = scanner.nextInt();
                    if (studentMap.containsKey(StudentId)) {
                        System.out.println("이미 등록된 학번입니다.");
                    } else {
                        scanner.nextLine();
                        System.out.print("이름을 입력하세요 : ");
                        String StudentName = scanner.nextLine();
                        studentMap.put(StudentId, StudentName);
                        System.out.println(StudentName + "님 등록이 완료되었습니다.");
                    }
                    break;
                case 2:
                    System.out.println("학번을 입력하세요 : ");
                    Integer loginId = scanner.nextInt();

                    if (studentMap.containsKey(loginId)) {

                    }

                    break;
                case 3:
                    System.out.println("학번을 입력하세요 : ");
                    break;
                case 4:
                    System.out.println();
                    System.out.println("--- 전체 수강생 목록 ---");
                    for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
                        System.out.println("학번 : " + entry.getKey() + " 이름 : " + entry.getValue());
                    }
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 메뉴 선택입니다.");
                    break;
            }
        }
    }
}
