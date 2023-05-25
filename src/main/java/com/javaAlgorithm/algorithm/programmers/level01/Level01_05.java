package com.javaAlgorithm.algorithm.programmers.level01;

/*
* 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
* 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
*
* x는 -10000000 이상, 10000000 이하인 정수입니다.
* n은 1000 이하인 자연수입니다.
* */


import java.util.Scanner;

public class Level01_05 {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        int num = 0;

        if(( -10000000 < x && x < 10000000  ) && n <1000){
            for (int i = 0; i < n; i++) {
                answer[i] = x * (i + 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        long[] result = Level01_05.solution(x,n);
        for (long l : result) {
            System.out.println(l);
        }

    }


}
