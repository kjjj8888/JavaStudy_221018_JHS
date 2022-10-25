package Ex_1004;
import java.util.Random;
public class CreateCircle {
    Random random = new Random();
    public final int N = random.nextInt(10000);
    int [] firstQ = new int[N];
    int [] secondQ = new int[N];
    public CreateCircle() {
        this.firstQ = firstQ;
        this.secondQ = secondQ;
    }

    public int[] setQ(int[] anyQ) {
        for (int i = 0; i < this.firstQ.length; i++) {

            anyQ[i] = random.nextInt(10000);
        }

        return anyQ;
    }
}
