package com.ohgiraffers.section02.uses.subsection03;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 스트림의 최종연산(Terminal Operator)중 하나인 calculation에 대해
        *           이해하고 사용할 수 있다.
        *  */
        long count = IntStream.range(1, 10).count();
        int sum = IntStream.range(1, 10).sum();

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);

//        OptionalInt max = IntStream.range(1, 10).max();
        OptionalInt max = IntStream.range(1, 1).max();      // 기본자료형도 존재하지 않으면 empty
        System.out.println("max = " + max);

        OptionalInt min = IntStream.range(1, 10).min();
        System.out.println("min = " + min);

        int oddSum = IntStream.range(1, 10)
                              .filter(i -> i % 2 == 1)
                              .sum();
        System.out.println("oddSum = " + oddSum);

    }
}
