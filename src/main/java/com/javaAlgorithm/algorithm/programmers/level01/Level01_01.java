package com.javaAlgorithm.algorithm.programmers.level01;

/*
* n의 약수의 합을 구하시오
* */


public class Level01_01 {
    public static int Sol(int n) {
        int answer = 0;

        if (n == 0) {
            return n;
        } else {
            for (int i = 1; i<= n; i++){
                if(n%i ==0){
                    answer += i;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int result = Level01_01.Sol(10);

        System.out.println(result);

    }


}
