package com.javaAlgorithm.algorithm.programmers;

/*
#문제 설명
    문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
    예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

#제한 사항
    s는 길이 1 이상, 길이 8 이하인 문자열입니다.
    s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.
#입출력 예
    s	return
    "a234"	false
    "1234"	true
* */


public class Level01_26 {

    public static boolean solution(String s) {
        boolean answer = false;
        String reg = "[0-9]+";
        if (s.length() == 4 || s.length() == 6) {
            if(s.matches(reg)){
                answer = true;
            }
        }
        return answer;
    }
    public static boolean solution2(String s) {
        boolean answer = false;
        try {
            if (s.length() == 4 || s.length() == 6) {
                int i = Integer.parseInt(s);
                return answer = true;
            }
        } catch (NumberFormatException e) {
            return answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "d234";

        boolean result = Level01_26.solution2(s);

        System.out.println(result);
    }



}
