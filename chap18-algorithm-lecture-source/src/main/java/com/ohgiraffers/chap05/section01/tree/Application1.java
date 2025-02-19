package com.ohgiraffers.chap05.section01.tree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Application1 {

    static int N;
    static int[] parent;
    static boolean[] isVisited;
    static StringTokenizer st;
    static List<Integer>[] list;
    static StringBuilder sb = new StringBuilder();

    public static BufferedReader toBufferedReader(String input){
        InputStream is = new ByteArrayInputStream(input.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static String solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        sb.delete(0, sb.length());          // 알고리즘과는 무관하지만 테스트 코드 환경이라 앞선 내용 삭제

        N = Integer.parseInt(br.readLine());

        isVisited = new boolean[N + 1];
        list = new ArrayList[N + 1];
        parent = new int[N + 1];

        /* 설명. 각각의 노드(인덱스 번호와 일치)들이 ArrayList를 하나씩 가지도록 초기화 */
        for(int i=1; i<=N; i++){
            list[i] = new ArrayList<>();
        }

        /* 설명. N-1개 줄에 걸쳐서 각 노드들 정보 입력 */
        for(int i=1; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        dfs(1);

        /* 설명. 2번 노드의 부모부터 확인해서 StringBuilder에 누적 */
        for(int i=2; i<=N; i++){
            sb.append(parent[i]).append(" ");
        }
        return sb.toString();
    }

    private static void dfs(int i) {
        isVisited[i] = true;

        for(int node : list[i]){
            if(!isVisited[node]){
                parent[node] = i;
                dfs(node);
            }
        }
    }
}
