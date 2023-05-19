package com.javaAlgorithm.algorithm.programmers;

/*
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다

* */


import java.util.Arrays;
import java.util.Scanner;

public class Level01_11 {
    public static long solution(int a, int b) {
        long answer = 0;

        int max = (a < b) ? b : a;
        int min = (a < b) ? a : b;

        for (int i = min; i <= max; i++) {
            answer += i;
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = Level01_12.solution2(a,b);
        System.out.print(result);

    }


}
