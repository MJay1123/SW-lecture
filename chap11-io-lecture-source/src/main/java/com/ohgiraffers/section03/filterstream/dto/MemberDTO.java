package com.ohgiraffers.section03.filterstream.dto;

import java.io.Serializable;

public class MemberDTO implements Serializable {
    private String id;
    private String pwd;
    private String name;
    private String email;
    private int age;
    private char gender;

    public MemberDTO(){

    }

    public MemberDTO(String id, String pwd, String name, String email, int age, char gender) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }


}
