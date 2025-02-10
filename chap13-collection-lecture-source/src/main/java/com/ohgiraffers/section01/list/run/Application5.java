package com.ohgiraffers.section01.list.run;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
//        대부분 LinkedList를 많이 사용한다.
//    Queue que = new Queue();      // Queue의 생성자를 활용할 수 없다.
//    (Queue의 구현체는 하위 타입으로 만들어야 한다.)
//        Queue<String> que = new LinkedList<String>();

        /* 설명. PriorityQueue를 홯용하면 선입선출 + 정렬의 개념을 가져갈 수 있다. */
//        Queue<String> que = new PriorityQueue<>();
        Queue<String> que = new PriorityQueue<>(Collections.reverseOrder());

        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");
        System.out.println("que : " + que);

        System.out.println("peek() : " + que.peek());
        System.out.println("que : " + que);
        System.out.println("poll() : " + que.poll());
        System.out.println("que : " + que);
        System.out.println("poll() : " + que.poll());
        System.out.println("que : " + que);
        System.out.println("poll() : " + que.poll());
        System.out.println("que : " + que);
        System.out.println("poll() : " + que.poll());
        System.out.println("que : " + que);
        System.out.println("poll() : " + que.poll());
        System.out.println("que : " + que);

    }
}
