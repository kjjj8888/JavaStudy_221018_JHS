package j07_반복;

public class BreakAndContinue {
    public static void main(String[] args) {
        int i = 0;

        while (true) {

            if (i == 9) {
                break;
            }
            System.out.println(i);
            i++;
        }

        for (int j = 0; j < 10; j++) {
            if(j == 7) {
                System.out.println("It's seven");
                break;
            }
            System.out.println(j);
        }

        System.out.println("-----------Continue --------");

        for (int j = 0; j < 100; j++) {
            if(j % 5 != 0) {
                continue;
            }
        }
    }

}
