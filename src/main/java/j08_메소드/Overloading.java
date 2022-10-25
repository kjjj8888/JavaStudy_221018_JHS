package j08_메소드;

public class Overloading {
    public static void add()
    {
        System.out.println("add()");
    }

    public static void add(int a)
    {
        System.out.println("add(a)");
    }

    public static void add(String s)
    {
        System.out.println("String s)");
    }

    public static void main(String[] args) {
        add();
        add(1);
    }

}
