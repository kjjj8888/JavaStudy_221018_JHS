package j08_메소드;

import java.util.Scanner;

public class Method2 {
    //별 찍기

    public static String getStar(int n, int select) {
        String star = "";
        char a = '*';
        if(select == 1)
        {
            for(int i = 0; i < n; i++){

                for(int j = 0; j < i; j++) {
                    star += a;
                }
                star += "\n";
            }

        } else if (select == 2) {
            for(int i = 0; i < n; i++){

                for(int j = n; j > i; j--) {
                    star += " ";
                }
                for(int j = 0; j < i; j++) {
                    star += a;
                }
                star += "\n";
            }
        } else if (select == 3) {
            for(int i = 0; i < n; i++){

                for(int j = n; j > i; j--) {
                    star += a;
                }
                star += "\n";
            }
        } else if (select == 4) {
            for(int i = 0; i < n; i++){

                for(int j = 0; j < i; j++) {
                    star += " ";
                }
                for(int j = n; j > i; j--) {
                    star += a;
                }
                star += "\n";
            }
        }


        return star;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int select = 0;
        System.out.print("별의 개수 입력:");
        n = scanner.nextInt();

        System.out.println("1. 왼쪽에 치우친 증가하는 별");
        System.out.println("2. 오른쪽에 치우친 증가하는 별");
        System.out.println("3. 왼쪽에 치우친 감소하는 별");
        System.out.println("4. 오른쪽에 치우친 감소하는 별");
        select = scanner.nextInt();

        String star = getStar(n, select);
        System.out.println("[결과]");
        System.out.println(star);
    }
}
