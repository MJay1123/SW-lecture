package com.ohgiraffers.chap06.section01.dp;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Application2 {

    public static BufferedReader toBufferedReader(String input) {
        InputStream is = new ByteArrayInputStream(input.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static int solution(int n){
        int[] dp = new int[1000 + 1];
        if(n >= 1) dp[1] = 1;
        if(n >= 2) dp[2] = 2;
        if(n >= 3){
            for(int i=3; i<=n; i++){
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
}
