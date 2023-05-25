package com.javaAlgorithm.algorithm.programmers.level01;

/*
* 자연수 n이 주어졌을 때 n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수를 구하시오
* */


public class Level01_02 {
    public static int Sol(int n) {
        int answer = 0;

        for (int i = 2; i < n; i++) {
            if (n%i == 1) {
                return i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int result = Level01_02.Sol(10);

        System.out.println(result);

    }


}
