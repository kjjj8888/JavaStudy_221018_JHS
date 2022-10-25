package j07_반복;
import java.util.Random;

public class RandomNumber {

    public static int calcRandom(int m)
    {
        Random rand = new Random();
        int result = rand.nextInt(m);
        return m;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int money = 5000;

        int k = rand.nextInt(100);
        System.out.println(k);

    }
}
