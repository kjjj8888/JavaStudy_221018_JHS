package j09_클래스;

public class ClassAMain {
    public static void main(String[] args) {
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());

        ClassA a = new ClassA();
        ClassA b = new ClassA();
        ClassA c = new ClassA("Nighte3", 10);
        a.setName("Nighte");
        a.setAge(20);
        System.out.println(a.getName());
        b.setName("Nighte2");
        b.setAge(30);
        System.out.println(b.getName());
        a.callName();
        b.callName();
    }
}
