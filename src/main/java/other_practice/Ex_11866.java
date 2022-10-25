package other_practice;
import java.util.Random;

public class Ex_11866 {

    public static int N = 10;

// failure example
    public static Object[] dequeue(Object[] circlularQueue, int K){
        Object[] smallerQueue = new Object[circlularQueue.length - 1];
        int j = 0;
        for(int i = 0; i < circlularQueue.length - 1; i++){

            if(i == K) {
                System.out.println(Integer.parseInt(circlularQueue[j].toString()));
                j++;
            }
                smallerQueue[i] = circlularQueue[j];

            j++;
        }
        return smallerQueue;
    }


    public static void main(String[] args) {

        Random random = new Random();
        Object[] circlularQueue = new Object[N];
        int K = random.nextInt(N);
        System.out.println(K);
        System.out.println("--------------");
        for(int i = 0; i < N; i++) {
            circlularQueue[i] = i;
        }


        circlularQueue = dequeue(circlularQueue, K);
        while(circlularQueue.length > 0)
        {
            System.out.println("--" + circlularQueue.length + "--");
            if(2 * K > circlularQueue.length)
            {
                K += K;
                K -= circlularQueue.length;
            }
            else
            {
                K += K;
            }
            circlularQueue = dequeue(circlularQueue, K);
        }





    }
}