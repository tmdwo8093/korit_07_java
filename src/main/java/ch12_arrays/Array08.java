package ch12_arrays;

public class Array08 {
    // 접근 지정자 / retrun 자료형 / 메서드명(매개변수) { 구현부가 어떤식으로 이루어 질 지 return }

    public int calcSum(int[] scores) {
        int sum = 0;
        for ( int i = 0 ; i < scores.length ; i++ ) {
            sum += scores[i];
        }
        return sum;
    }
    
    public double calcAvg(int[] scores) {
        return calcSum(scores) / scores.length;
    }
    

    public static void main(String[] args) {
        // 위에 정의한 method 호출하기 위해 객체 생성했습니다.
        Array08 array08 = new Array08();
        int[] scores = { 100, 97, 55, 24, 49, 60, 20, 77, 89};
        
        // 이상의 예시 배열을 argument로 하는 총합을 구하는 metgod calcSum,
        // 평균을 구하는 calcAvg method를 정의하는데, call4() 유형으로 만드시오

        System.out.println("총합 : " + array08.calcSum(scores) + "점");
        System.out.println("평균 : " + array08.calcAvg(scores) + "점");
    }
}
