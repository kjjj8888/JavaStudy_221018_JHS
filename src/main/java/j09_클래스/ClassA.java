package j09_클래스;

public class ClassA {

    private String name;
    private int age;
    public double score;
    public int d;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void callName()
    {
        System.out.println(name + "을 부릅니다");
    }
    public ClassA() {};
    public ClassA(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
