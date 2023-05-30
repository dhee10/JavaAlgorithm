package com.javaAlgorithm.algorithm.programmers.level01;

/*
#문제 설명
    자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

#제한사항
    n은 1 이상 100,000,000 이하인 자연수입니다.

#입출력 예
    n	    result
    45	    7
    125	    229

#입출력 예 설명
    입출력 예 #1

    답을 도출하는 과정은 다음과 같습니다.
    n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
    45	        1200	    0021	        7
    따라서 7을 return 해야 합니다.

    입출력 예 #2

    답을 도출하는 과정은 다음과 같습니다.
    n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
    125	11122	22111	229
    따라서 229를 return 해야 합니다.
* */


import java.util.ArrayList;
import java.util.Scanner;

public class Level01_31 {
    public static int solution(int n) {
        //3진법 변환
        String nString = Integer.toString(n, 3);
        char[] chars = nString.toCharArray();
        nString = "";
        for (int i = chars.length-1; i >= 0; i--) {
            nString = nString + String.valueOf(chars[i]);
        }

        return Integer.parseInt(nString,3);
    }

    public static int solution2(int n) {
        String a = "";

        while (n > 0) {
            a = (n % 3) + a ; // 10진법 -> 3진법
            n /= 3;
        }

        a = new StringBuilder(a).reverse().toString();

        return Integer.parseInt(a,3);

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 45;


        int result = Level01_31.solution2(n);

        System.out.println(result);
    }




}
