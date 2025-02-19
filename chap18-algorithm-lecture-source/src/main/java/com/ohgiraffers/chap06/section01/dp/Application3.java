package com.ohgiraffers.chap06.section01.dp;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Application3 {
    public static BufferedReader toBufferedReader(String str){
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static Integer[] dp = new Integer[101];

    public static int solution(int n){
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        return padovan(n);
    }

    private static int  padovan(int n){

        /* 설명. 재귀 호출에 의한 stackoverflow을 막기 위해 null이 아닌 값을 만날 때까지만
        *       재귀 호출함(값이 비워져 있으면 점화식으로 채운다) */
        if(dp[n] == null) dp[n] = padovan(n-2) + padovan(n-3);        // n 앞 부분의 dp를 채우기 위해 재귀호출
        return dp[n];
    }
}
