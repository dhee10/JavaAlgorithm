package com.javaAlgorithm.algorithm.programmers.level01;

/*
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
* */


import java.util.Scanner;

public class Level01_07 {
/*    public static ArrayList solution(long n) {
        ArrayList answer = new ArrayList();


        for (int i = 1; 0 < n; i++) {
            answer.add(n % 10);
            n = n / 10;
        }

        return answer;
    }*/
    public static int[] solution(long n) {

        int[] answer = new int[String.valueOf(n).length()];
        int cnt = 0;
        while (n > 0) {
            answer[cnt] = (int) (n % 10);
            n /= 10;
            cnt++;
        }

        return answer;
    }

//    public static int[] ramda(long n) {
//        return new StringBuffer().append(n).reverse().chars().map(Character::getNumericValue).toArray();
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();

        int[] result = Level01_07.solution(s);
        for (int i : result) {
            System.out.print(i);
        }

    }


}
