package j07_반복;

import java.io.IOException;

public class PrintStar {
    public static void main(String[] args){
//        for(int i = 0; i < 10; i++){
//            for(int j = 0; j < i; j++) {
//                System.out.println(" ");
//
//            }
//            System.out.println(" ");
//        }
//
//        for(int i = 0; i < 10; i++){
//            for(int j = 10; i < j; j--) {
//                System.out.print("*");
//
//            }
//            System.out.println(" ");
//        }

        for(int i = 0; i < 10; i++){

            for(int j = 0; j < i; j++) {
                System.out.print("*");

            }
            for(int j = 10; i < j; j--) {
                System.out.print(" ");

            }
            for(int j = 10; i < j; j--) {
                System.out.print(" ");

            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for(int j = 10; i < j; j--) {
                System.out.print("*");

            }
            System.out.println("");
            for(int j = 10; i < j; j--) {
                System.out.print("*");

            }
            for(int j = 0; j < i; j++) {
                System.out.print(" ");

            }
        }


    }
}
