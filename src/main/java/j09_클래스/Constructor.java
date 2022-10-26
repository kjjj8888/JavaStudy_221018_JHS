package j09_클래스;

public class Constructor
{
    int num;
    String name;


    public Constructor() {
    }

    public Constructor(int num) {
        this.num = num;
    }

    public Constructor(String name) {
        this.name = name;
    }

    public Constructor(int num, String name) {
        this.num = num;
        this.name = name;
    }

    void showInfo()
    {
        System.out.println("num: " + num);
        System.out.println("name: " + name);
    }


}
