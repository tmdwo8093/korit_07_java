package ch12_arrays;
/*
    향상된 for문(Enhanced For Loop)

    일반 for 문과의 차이점 :
        일반 for문의 경우 index 넘버(주소지)를 명확하게 알고 있어야 하지만
        일일이 element의 숫자를 세는 것이 번거롭기 때문에
        arr01.length와 같은 방식으로 일종의 field 창조를 통해 int 값을 추출하여
        대입해야만 했습니다.

        그런데 잘 생각해보면 for (int i = 0; ...) 부분에서 int i는
        for문 내부에서 선언되고, 내부에서만 사용이 가능합니다.

        이를 응용하여 배열 내의 element에 for문 내부에서만 사용하는 변수에 대입하는
        방식으로 index 넘버(주소지)의 사용 없이 적용 할 수 있는 for 반복문이 있는데,
        이를 향상된 for문 이라고 합니다.

    제약 :
        일기만 되고, 쓰기가 안됩니다.(1부터 100까지 추출하는건 되는데 집어넣는건 제한적으로 됨)

    형식 :
        for(자료형 변수명 : 반복가능객체(배열)) {
            반복실행문
        }
 */
public class Array10EnhancedFor {
    public static void main(String[] args) {
        int[] nums = new int[200];

        for ( int i = 0 ; i < nums.length ; i++ ) {
            nums[i] = (i+1);
            System.out.println(nums[i]);
        }
        System.out.println();

        for ( int number : nums ) { // int[]
            System.out.println(number + " ");
            // 첫 번째 반복에서 nums의 첫 번째 element인 1을 number에 대입
            // 즉 number = 1; 이 된 상황 -> 어디서? 38번 라인에서
            // 대입이 된 상태로 39번 라인을 실행시킵니다. "1 " 까지 출력됩니다.
            // 그 다음 반복으로 넘어가서 nums의 두 번째 element인 2를 number에 대입
            // 39번 실행
            // 다음 3 대입
            // 39 실행
            // ... 200 대입
            // 39번 라인 실행 하고, 마무리(마무리 시점은 마지막 element 대입후
            // 반복 실행문 실행 후)
            // 이후에 반복문 바깥에서는 int i 와 동일하게
            // number 변수를 사용 할 수 없습니다.
        }
//         number = 201; : 오류 발생

        // Sting 배열에 김일, 김이, 김삼, 김사, 김오라는 element를 가지도록 작성하고
        // 일반 for문으로는 김일 김이 김삼 김사 김오 출력
        // 향상된 for문으로 동일하게 출력하시오.

        String[] names = {"김일" , "김이" ,"김삼","김사","김오"};
        for (int i = 0 ; i < names.length ; i++ ) {
            System.out.println(names[i] + " ");
        }
    }
}
