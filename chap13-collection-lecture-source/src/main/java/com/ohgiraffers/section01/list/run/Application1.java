package com.ohgiraffers.section01.list.run;

import java.util.*;

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

        /* 설명. ArrayList를 활용한 정렬 */
        /* 목차. 1. 문자열 데이터 정렬(feat.오름차순) */

        /* 설명. 은닉화(hiding)
        *   - 타입 은닉(다형성)
        *   - 구현 은닉(인터페이스 활용)
        *   - 필드 및 메소드 은닉(캡슐화(feat.private))
        *  */

//        List<String> stringList = new ArrayList<>();
        List<String> stringList = new LinkedList<>();       // 내림차순 할 때는 LinkedList로 변경
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("grape");

        System.out.println("문자열 데이터 : " + stringList);

        /* 설명. 실제로는 ArrayList 안에 있는 데이터인 String에 정의된 기준(오름차순)대로 정렬 됨 */
        Collections.sort(stringList);
        System.out.println("정렬된 문자열 데이터 : " + stringList);

        /* 목차. 1-1. 문자열 데이터 내림차순 정렬 */
        /* 설명. 다루는 Iterator와 해당 컬렉션의 제네릭 타입은 왠만하면 꼭 명시하자.(feat.다운캐스팅 방지(타입 안정성)) */
        Iterator<String> iter = ((LinkedList) stringList).descendingIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }


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
