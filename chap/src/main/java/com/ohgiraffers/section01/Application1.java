package com.ohgiraffers.section01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {

        /* 설명.
        *   내부적으로 버퍼(buffer)를 활용해서 입출력 성능을 향상 시킨다.
        *   추가적인 */

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/section03/filterstream/testBuffed.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(bw != null) bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
