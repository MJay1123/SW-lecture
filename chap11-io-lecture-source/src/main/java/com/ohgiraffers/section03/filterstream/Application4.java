package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;

import java.io.*;
import java.util.Arrays;

public class Application4 {
    public static void main(String[] args) {

        /* 설명. transient 키워드가 달린 필드는 객체 입출력 시 (직렬화 시 대상이 되지 않는다.) 출력되지 않는다. */
        MemberDTO[] memArr = new MemberDTO[100];
        memArr[0] = new MemberDTO("user01", "pass01", "홍길동",
                "hong123@gmail.com", 25, '남');
        memArr[1] = new MemberDTO("user02", "pass02", "유관순",
                "korea31@gmail.com", 16, '여');
        memArr[2] = new MemberDTO("user03", "pass03", "강감찬",
                "kang@gmail.com", 38, '남');

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt"));

//            oos.writeObject(memArr[0]);
            for(int i=0; i<memArr.length; i++){
                oos.writeObject(memArr[i]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(
                    new FileInputStream(
                            "src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt"
                    )
            );

            MemberDTO[] newMemArr = new MemberDTO[memArr.length];

//            newMemArr[0] = (MemberDTO)ois.readObject(0);
            int index = 0;
            while (true) {
                newMemArr[index++] = (MemberDTO) ois.readObject();
            }
        } catch (EOFException e) {
            System.out.println("회원 정보 읽기 완료!");
        } catch (IOException e) {
                throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
