package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {



    public void testSimpleIfElseStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력하세요: ");
        int input = sc.nextInt();

        if(input % 2 != 0) {
            System.out.println("입력하신 정수는 홀수입니다.");
        } else {
            System.out.println("입력하신 정수는 짝수입니다.");
        }

        /* 의사 코드(Pseudo-code) */

//        만약에 (홀수라면) {
//          "입력하신 정수는 홀수입니다." 출력
//        } 그렇지 않다면 {
//          "입력하신 정수는 짝수입니다." 출력
//        }
    }

    public void testNestedIfElseStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력해 주세요.");

        int input = sc.nextInt();

        /* 설명. 정수를 하나 입력 받아 양수와 음수를 구분하고 양수일 경우에만 홀수/짝수를 판별한다. */
        if(input > 0) {
            if(input % 2 == 1) {
                System.out.println("입력하신 정수는 홀수입니다.");
            } else {
                System.out.println("입력하신 정수는 짝수입니다.");
            }
        } else {
            System.out.println("입력하신 정수는 양수가 아니라 음수입니다.");
        }
    }
}
