package com.javaAlgorithm.algorithm.programmers;

/*
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

* */


import java.util.Scanner;

public class Level01_08 {
    public static long solution(long n) {
        long x = (long) Math.sqrt(n);
        return (x*x) == n? (long) Math.pow(x+1,2) : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();

        long result = Level01_08.solution(s);
        System.out.print(result);

    }


}
