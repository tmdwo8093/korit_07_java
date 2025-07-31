package ch07_loops;
/*
    Nested for - loop
    for(시작값 ; 한계값 ; 증감값) {
        반복실행문 1-a
        for(시작값 ; 한계값 : 증감값) {
            반복실행문 2
        }
         반복실행문 1-b
        for(시작값 ; 한계값 : 증감값) {
            반복실행문 3
        }
        반복실행문 1-c
 */
public class Loop06 {
    public static void main(String[] args) {
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /*
            별 찍기를 통한 for문 구조 학습
                        i = 0, j = 0 일 때는 두 번째 for문이 작동 안하기 때문에 개행만 일어남. 별x
            *           i = 1, j = 0 일 때 별 하나 찍히고 , i = 1 / j = 1일 때 fasle
            **          i = 2  j = 0 , 1 일떄 별이 두개
            ***         i = 3
            ****        i = 4
            *****       i = 5, j = 0, 1, 2, 3, 4까지 다섯개의 별이 찍히고 종료
                        종료되고 나서 개행이 이루어지기 때문에
         */
//        for (int i = 5; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 100; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
