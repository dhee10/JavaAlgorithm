package com.javaAlgorithm.algorithm.programmers;

/*
프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

예시
phone_number	return
"01033334444"	"*******4444"

* */


import java.util.Arrays;
import java.util.Scanner;

public class Level01_16 {

    public static String solution(String phone_number) {
        String answer = "";
        String[] number = phone_number.split("");

        for (int i = 0; i < (phone_number.length() - 4); i++) {
            number[i] = "*";
        }
        return answer = Arrays.stream(number).collect(Collectors.joining(""));
    }

    public static String solution2(String phone_number) {
        char[] ch = phone_number.toCharArray();

        for (int i = 0; i < phone_number.length() - 4; i++) {
            ch[i] = '*';
        }

        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phone_number = "01033334444";

        String result = Level01_16.solution2(phone_number);

        System.out.println(result);
    }


}
