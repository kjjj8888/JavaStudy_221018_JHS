package j09_클래스.Student풀이;

public class ClassB {
    public static void main(String[] args) {
        Student student1 = new Student();

        Student student2 = new Student("SchoolA", 202302, "st2", 2 );

        Student student3 = new Student("SchoolB", 202303);

        student1.setStudentName("st1");
        student1.setSchoolName("SchoolA");
        student1.setStudentCode(202301);
        student1.setStudentYear(1);

        student1.studentInfo();
        student2.studentInfo();
        student1.increaseStudentYear(2);
        student3.studentInfo();
        student3.increaseStudentYear();
    }
}
