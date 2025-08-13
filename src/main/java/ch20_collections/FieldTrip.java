package ch20_collections;

import java.util.*;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생이 수학 여행지를 입력하시겠습니까? ");
        int studentCount = scanner.nextInt();
        scanner.nextLine();

        List<String> fieldTripList= new ArrayList<>();

        for (int i = 0; i < studentCount; i++) {
            System.out.print((i + 1) + "번의 학생의 수학 여행지를 입력하세요 >>> ");
            String destination = scanner.nextLine();
            fieldTripList.add(destination);
        }
        System.out.println();

        for (int i = 0; i < fieldTripList.size(); i++) {
            System.out.println((i + 1) + " 번 학생의 후보지 : " + fieldTripList.get(i));
        }
        System.out.println();

        Set<String> fieldTripSet = new LinkedHashSet<>();
        fieldTripSet.addAll(fieldTripList);

        List<String> finalfieldTrips = new ArrayList<>();
        finalfieldTrips.addAll(fieldTripSet);

        System.out.println("수학 여행 후보지는");
        for (String destination : finalfieldTrips) {
            System.out.println(destination);
        }
        System.out.println("입니다.");




        /*
            1. 학생의 수를 입력받아 해당 횟수반큼 반복문을 올릴 것.
            2. 1번 ~ 5번 학생의 응답을 fieldTrip List에 저장할것
            3. 중복을 제거하기 위하여 fieldTripSet에 이상의 List의 element들을 옮겨 담을 것
            4. 맨 마지막 출력문은 Set -> List로 재이동하여 finalfieldTrips List에서 element들을 추출하여 작성할것
            실행 예
            몇 명의 학생이 수학 여행지를 입력하시겠습니까? 5명

            1 번 학생의 수학 여행지를 입력하세요 >>> 제주
            2 번 학생의 수학 여행지를 입력하세요 >>> 제주
            3 번 학생의 수학 여행지를 입력하세요 >>> 민속촌
            4 번 학생의 수학 여행지를 입력하세요 >>> 민속촌
            5 번 학생의 수학 여행지를 입력하세요 >>> 제주

            1 번 학생의 후보지 : 제주
            2 번 학생의 후보지 : 제주
            3 번 학생의 후보지 : 민속촌
            4 번 학생의 후보지 : 민속촌
            5 번 학생의 후보지 : 제주

            수학 여행 후보지는
            제주
            민속촌
            입니다.

         */
    }
}
