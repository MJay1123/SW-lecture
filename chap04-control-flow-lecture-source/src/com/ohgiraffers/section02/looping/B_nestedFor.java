package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwoToNine() {

        /* 설명.
        *   2단
        *   2 * 1 = 2
        *   2 * 2 = 4
        *   ...
        *   3단
        *   3 * 1 = 3
        *   3 * 2 = 6
        *   ...
        *   9단
        *   9 * 1 = 9
        *   9 * 2 = 18
        *   ...
        *   9 * 9 = 81
        *  */

//        for(int dan=2; dan<=9; dan++){
//            System.out.println(dan + "단");
//            for(int su=1; su<=9; su++){
//                System.out.println(dan + " * " + su + " = " + (dan * su));
//            }
//            System.out.println();
//        }

        for(int dan=2; dan<=9; dan++){
            System.out.println(dan + "단");
            printGugudanOf(dan);
            System.out.println();
        }
    }

    private static void printGugudanOf(int dan) {
        for(int su=1; su<=9; su++){
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    public void printStars() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오: ");
        int input = sc.nextInt();
        for (int i=0; i<input; i++){

            /* 설명. 공백 찍기 */
            printSpace(input, i);

            /* 설명. 별 찍기 */
            printStars(i);
            System.out.println();
        }

//        for(int i = 1; i <= input; i++){
//            for(int j = 1; j <= input - i; j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }

    private static  void printStars(int i) {
        for(int j = 0; j< i +1; j++) {
            System.out.print("*");
        }
    }

    private static void printSpace(int input, int i) {
        for (int j = 0; j< input - (i +1); j++){
            System.out.print(" ");
        }
    }
}
