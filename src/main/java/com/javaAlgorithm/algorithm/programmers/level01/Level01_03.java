package com.javaAlgorithm.algorithm.programmers.level01;

/*
* 짝수 홀수 구하기
* */


public class Level01_03 {
    public static String Sol(int n) {
        return (n%2 == 0)? "Even" :"Odd";
    }

    public static void main(String[] args) {
        String result = Level01_03.Sol(10);
        System.out.println(result);

    }


}
