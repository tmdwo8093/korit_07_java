package students;

public class StudentMain {
    public static void main(String[] args) {

        Student Student1 = new Student();
        Student1.StudentCode = 2024001;
        Student1.name = "김일";
        Student1.score = 4.5;

        Student Student2 = new Student(2024002);
        Student2.StudentCode = 2024002;
        Student2.name = "김이";
        Student2.score = 100;

        Student Student3 = new Student("김삼");
        Student3.StudentCode = 2024003;
        Student3.name = "김삼";
        Student3.score = 95.8;

        Student Student4 = new Student(2024004,"김사");
        Student4.StudentCode = 2024004;
        Student4.name = "김사";
        Student4.score = 4.0;

        Student Student5 = new Student(2024005,"김오", 80.7);
        Student5.StudentCode = 2024005;
        Student5.name = "김오";
        Student5.score = 80.7;

        System.out.println();
        Student1.showInfo();
        Student2.showInfo();
        Student3.showInfo();
        Student4.showInfo();
        Student5.showInfo();
    }
}
