package j09_클래스.Student풀이;

public class Student {

    private String schoolName;
    private int studentCode;
    private String name;
    private int studentYear;


    public String getStudentName() {
        return name;
    }
    public void setStudentName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getStudentYear() {
        return studentYear;
    }
    public void setStudentYear(int studentYear) {
        this.studentYear = studentYear;
    }

    public int getStudentCode() {
        return studentCode;
    }
    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public void increaseStudentYear(int year) {
        if(studentYear >= 5)
        {
            System.out.println("It's already the highest studentYear");
        }
        else
        {
            studentYear  += year;
            studentInfo();
        }

    }

    public void increaseStudentYear() {
        if(studentYear >= 5)
        {
            System.out.println("It's already the highest studentYear");
        }
        else
        {
            studentYear++;
            studentInfo();
        }

    }

    public void studentInfo()
    {
        System.out.println("School Name: " + schoolName);
        System.out.println("Student Code: " + studentCode);
        System.out.println("Name: " + name);
        System.out.println("Student Year: " + studentYear);
        System.out.println("--------------------------------------------------------");
    }

    public Student(){

    }

    public Student(String schoolName, int studentCode, String name, int studentYear) {
        this.schoolName = schoolName;
        this.studentCode = studentCode;
        this.name = name;
        this.studentYear = studentYear;
    }

    public Student(String schoolName, int studentCode)
    {
        this.schoolName = schoolName;
        this.studentCode = studentCode;
        this.name = "student3";
        this.studentYear = 3;
    }
}
