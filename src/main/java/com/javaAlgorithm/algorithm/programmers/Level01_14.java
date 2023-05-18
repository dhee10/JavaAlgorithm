package com.javaAlgorithm.algorithm.programmers;

/*
String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

* */


import java.util.Arrays;
import java.util.Scanner;

public class Level01_11 {

    public static String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";

            }
        }
        return answer;
    }

    public static String solution2(String[] seoul) {
        int answer = Arrays.asList(seoul).indexOf("kim");
        return "김서방은 "+answer+"에 있다";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seoul = {"dddd","rka", "accc","kim","dddd"};

        String result = Level01_11.solution2(seoul);
        System.out.print(result);

    }


}
