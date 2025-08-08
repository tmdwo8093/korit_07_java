package ch03_operator;
/*
    논리 연산자

    true(1) / flase(0) : 컴푸터가 읽을 수 있는 두 숫자
    boolean : ture / false 를 구분하는 자료형

    AND(&&) : 곱 연산자
    OR(||) : 더하기 연산자
    NOT(!) : ture 값을 flase로, flase값을 true로 역전 시키는 연산자

 */
public class Operator02 {
    public static void main(String[] args) {
        boolean Flag1 = true;
        boolean Flag2 = false;
        System.out.println("-------- && 연산자 --------");
        boolean result1 = Flag1 && Flag1;
        System.out.println("T x T = " + result1);
        boolean result2 = Flag1 && Flag2;
        System.out.println("T x F = " + result2);
        boolean result3 = Flag2 && Flag2;
        System.out.println("F x F = " + result3);
        // || 연산자 부분을 result 4, 5, 6으로 작성하시오
        boolean result4 = Flag1 || Flag1;
        System.out.println("T + T = " + result4);
        boolean result5 = Flag1 || Flag2;
        System.out.println("T + F = " + result5);
        boolean result6 = Flag2 || Flag2;
        System.out.println("F + F = " + result6);

        boolean result7 = (Flag1 || Flag2) && Flag2;
        System.out.println(result7);

        boolean result8 = 10 % 3 == 0;
        System.out.println(result8);

        // 그렇다면 나머지 연산의 결과값의 자료형은 무엇이여만 하는가? -> int
    }
}
