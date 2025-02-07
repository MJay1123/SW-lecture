package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 컬렉션 프레임워크에 대해 이해할 수 있다.(list부터) */
//    ArrayList list = new ArrayList();
        List<Object> list = new ArrayList();        // List 계열은 다형성 적용 가능(ArrayList는 List의 자식 클래스)

        /* 설명. 데이터를 넣은 순서를 기억한다. */
        list.add("apple");
        list.add(123);
        list.add(45.67);
        list.add(new java.util.Date());

        /* 설명. 모든 컬렉션은 toString()이 잘 오버라이딩 되어 쉽게 출력할 수 있다. */
        System.out.println("list = " + list);

        System.out.println("첫 번째 값 : " + list.get(0));
        System.out.println("두 번째 값 : " + list.get(1));
        System.out.println("list에 담긴 데이터의 크기 ; " + list.size());

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        /* 설명.
        *   배열보다 ArrayList가 좋은 점
        *   1. 미리 크기를 할당할 필요가 없다.
        *   2. 들어있는 값의 갯수를 잘 파악할 수 있다.(size())
        *   3. 경우에 따라(제네릭 타입을 생략하면) 다양한 타입을 담아낼 수 있다.
        *   4. 중간에 값을 추가 및 삭제가 용이하다.
        *  */

        /* 설명. 2번째 위치에 10을 끼워 넣기 */
        list.add(1, 10);
        System.out.println("list = " + list);

        list.set(0, "banana");
        System.out.println("list = " + list);

        list.remove(0);
        System.out.println("list = " + list);
        System.out.println("처음 요소 제거 후 처음 요소 : " + list.get(0));

        /* 추가로, 컬렉션 대신 배열로 한번 중간에 값 추가 연습해 보기 */
        int[] intArr = new int[5];
        int num = 0;
        for (int i=0; i<intArr.length; i++){
            intArr[i] = ++num;
        }
        System.out.println(Arrays.toString(intArr));

        /* 설명. 2번째 위치에 7을 추가해 (기존 배열 크기 + 1)이 되는 코드 작성 */
//        intArr = arrayAdd(1, 7, intArr);
        int index = 1;
        int[] newIntArr = new int[intArr.length+1];
        System.arraycopy(intArr, 1, newIntArr, 2, 4);
        newIntArr[0] = intArr[0];
        newIntArr[index] = 7;
        System.out.println(Arrays.toString(newIntArr));


    }

//    public static int[] arrayAdd(int index, int number, int[] array){
//        int[] newArray = new int[array.length + 1];
//        for(int i=0; i<index; i++){
//            newArray[i] = array[i];
//        }
//        newArray[index] = number;
//        for(int i=index+1; i<newArray.length; i++){
//            newArray[i] = array[i-1];
//        }
//        return newArray;
//    }
}
