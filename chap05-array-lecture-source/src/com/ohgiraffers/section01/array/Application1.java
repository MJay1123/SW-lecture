package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 배열에 대해 이해하고 배열의 사용 목적을 이해할 수 있다. */

        int num1 = 10;
        int num2 = 10;
        int num3 = 10;
        int num4 = 10;
        int num5 = 10;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println("sum = " + sum);

        int[] arr = new int[5];     // [0][0][0][0][0]
        System.out.println("arr = " + arr.toString());
        System.out.println("배열의 모습을 보고 싶어: " + Arrays.toString(arr));       // 1차원 배열일 경우에만 가능

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        /* 설명. 10부터 50까지의 값을 5개의 공간에 담기 */
        for(int i=0; i<=4; i++){
            arr[i] = (i+1)*10;
        }

        int arrSum = 0;
        for(int i=0; i<5; i++){
            arrSum += arr[i];
        }

        System.out.println("arrSum = " + arrSum);

    }
}
