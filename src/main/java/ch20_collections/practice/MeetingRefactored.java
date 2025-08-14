package ch20_collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MeetingRefactored {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Set으로 중복을 알아서 걸러냅니다.
        Set<String> attendees = new HashSet<>();

        System.out.println("--- 모임 참석자 명단 관리 ---");
        System.out.println("[ 종료 ] 라고 입력하면 프로그램을 종료합니다.");

        // while(true)와 break를 사용한 입력 루프는 아주 좋은 패턴입니다.
        while (true) {
            System.out.print("참석자 이름을 입력하세요 >>> ");
            String name = scanner.nextLine();

            // .equals()로 종료 조건을 먼저 확인하는 것이 깔끔합니다.
            if (name.equals("종료")) {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }

            // Set의 add 메서드는 중복일 경우 false를 반환합니다.
            // 이걸 활용해서 사용자에게 피드백을 줄 수 있습니다.
            if (!attendees.add(name)) {
                System.out.println("'" + name + "'님은 이미 명단에 있습니다. (중복 제외)");
            }
        }

        System.out.println("\n--- 최종 참석자 명단 ---");

        // [개선된 부분]
        // 복잡한 for문과 if문 대신 String.join()을 사용합니다.
        // 첫 번째 인자: 각 요소를 연결할 구분자 (", ")
        // 두 번째 인자: 연결할 데이터가 담긴 컬렉션 (attendees)
        // 이 한 줄이 아래의 복잡한 for문을 완벽하게 대체합니다.
        String finalAttendeeList = String.join(", ", attendees);

        System.out.println(finalAttendeeList);

        scanner.close();
    }
}
