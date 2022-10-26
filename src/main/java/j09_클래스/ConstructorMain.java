package j09_클래스;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor("s1");
        Constructor c3 = new Constructor(10);
        Constructor c4 = new Constructor(20, "s2");
        c1.showInfo();
        c2.showInfo();
        c3.showInfo();
        c4.showInfo();
    }
}
