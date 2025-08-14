package ch20_collections.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberManager {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map< String, String> memberMange = new HashMap<>();
    while (true) {
        System.out.println();
        System.out.println(" --- 회원 관리 시스템 --- ");
        System.out.println("1. 회원 가입 ");
        System.out.println("2. 로그인 ");
        System.out.println("3. 비밀번호 변경 ");
        System.out.println("4. 종료 ");
        System.out.print("메뉴를 선택하세요 >>> ");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                System.out.print("가입할 ID를 입력하세요 : ");
                String userId = scanner.nextLine();
                if (memberMange.containsKey(userId)) {
                    System.out.print("이미 사용중인 ID 입니다.");
                } else {
                    System.out.print("사용할 비밀번호를 입력하세요 : ");
                    String userPassWord = scanner.nextLine();
                    memberMange.put(userId, userPassWord);
                    System.out.println(userId + "님, 회원가입이 완료되었습니다.");
                }
                break;

            case 2:
                System.out.print("ID를 입력하세요 : ");
                String loginId = scanner.nextLine();

                // ID가 존재하는지 먼저 확인
                if (memberMange.containsKey(loginId)) {
                    System.out.print("비밀번호를 입력하세요 : ");
                    String loginPassWord = scanner.nextLine();

                    // [수정된 핵심 로직]
                    // .get(loginId)로 저장된 비밀번호를 꺼내와서,
                    // 입력받은 비밀번호(loginPassWord)와 .equals()로 비교합니다.
                    if (memberMange.get(loginId).equals(loginPassWord)) {
                        System.out.println(loginId + "님, 로그인 성공 !");
                    } else {
                        System.out.println("비밀번호가 일치하지 않습니다.");
                    }
                } else {
                    System.out.println("존재하지 않는 ID입니다.");
                }
                break;

            case 3:
                System.out.print("변경할 ID를 입력하세요 : ");
                String updateId = scanner.nextLine();

                // ID가 존재하는지 먼저 확인
                if (memberMange.containsKey(updateId)) {
                    System.out.print("현재 비밀번호를 입력하세요 : ");
                    String currentPassword = scanner.nextLine();

                    // [완성된 핵심 로직]
                    // 1. 현재 비밀번호가 맞는지 확인 (로그인 로직과 동일)
                    if (memberMange.get(updateId).equals(currentPassword)) {
                        // 2. 맞으면, 새로운 비밀번호를 입력받음
                        System.out.print("새로운 비밀번호를 입력하세요 : ");
                        String newPassword = scanner.nextLine();
                        // 3. .put()으로 기존 비밀번호를 덮어쓰기(수정)
                        memberMange.put(updateId, newPassword);
                        System.out.println("비밀번호가 성공적으로 변경되었습니다.");
                    } else {
                        System.out.println("현재 비밀번호가 일치하지 않습니다.");
                    }
                } else {
                    System.out.println("존재하지 않는 ID입니다.");
                }
                break;

            case 4:
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
