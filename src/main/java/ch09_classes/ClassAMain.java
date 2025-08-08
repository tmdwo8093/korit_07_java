package ch09_classes;

import java.util.Scanner;

/*

 */
public class ClassAMain {
    public static void main(String[] args) {
        // 객체 새성
        ClassA classA1 = new ClassA();
        Scanner scanner = new Scanner(System.in);

        // 그리고 우리는 객체의 메서드(기능)을 호출했었습니다.
//        scanner.nextLine();
        // ClassA에 선언된 변수들에 값을 대입하겠습니다.
        // 객체명.속성명 = 데이터;
        classA1.num = 1;
        classA1.name = "승재";
        classA1.score = 4.2;

        System.out.println(classA1.name + "학생의 " + "학번은" +
                classA1.num + " 점수는 " + classA1.score + "점 입니다." );

        // 메시드 호출 방법
        // 객체명.메서드명();
        classA1.callName(); // scanner.next(); 와 같은 방식이죠.

    }
}
