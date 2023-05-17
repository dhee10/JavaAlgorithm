package com.javaAlgorithm.algorithm.programmers;

/*
* 평균 구하기
* */


public class Level01_04 {
    public static double Sol(int[] n) {
        double answer = 0;

        for (int i : n) {
            answer += i;
        }

        return answer / n.length;
    }

//    public static double Sol2(int[] n) {
//        stream 이용시 아래와 같이 구현 가능
//        int answer = Arrays.stream(n).sum();
//        return (double) answer / n.length;
//    }


    public static void main(String[] args) {
        int[] arr = {10,11,12,13};

        double result = Level01_04.Sol(arr);
        System.out.println(result);

    }


}
