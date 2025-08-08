package ch12_arrays;
/*
    90 이상은 A
    ..

    ..
    59 이하는 F 인데,
    A가 몇명이고, B가 몇명이고 ... F가 몇명인지 출력 할 수 있도록 할 예정
 */
public class Array07 {
    public static void main(String[] args) {
        int[] scores = { 100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100 };
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        // int[] =/= int
        for ( int i = 0 ; i < scores.length ; i++ ) {
            if ( scores[i] >= 90 ) {
                a++;
            } else if ( scores[i] >= 80 ) {
                b++;
            } else if ( scores[i] >= 70 ) {
                c++;
            } else if ( scores[i] >= 60 ) {
                d++;
            } else {
                f++;
            }
        }
        System.out.println("A 학생 수 : " + a);
        System.out.println("B 학생 수 : " + b);
        System.out.println("C 학생 수 : " + c);
        System.out.println("D 학생 수 : " + d);
        System.out.println("F 학생 수 : " + f);

        // 여러분이 이제 고민할 부분은 -> 어차피 변수 adcdf가 하나하나 int니까
        // int[] 배열로 선언해가지고 선언하는 변수 개수를 줄일 수 있지 않을까
        int[] grades = { a, b, c, d, f };
        for ( int i = 0 ; i < grades.length ; i++ ) {
            System.out.println("grade[" + i + "] = " + grades[i]);

        }
        // A에 해당하는 점수 라면 grade[0] 숫자를 +1 해주고, B에 해당하면 grade[1] +1 ...
        // 굳이 다섯줄 써가면서 변수들을 선언할 필요가 없다.
    }

}
