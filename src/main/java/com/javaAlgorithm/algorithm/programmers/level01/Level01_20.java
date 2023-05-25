package com.javaAlgorithm.algorithm.programmers.level01;

/*
#문제 설명
    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
    단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

#재한사항
    s는 길이가 1 이상, 100이하인 스트링입니다.

#입출력 예
    s	        return
    "abcde"	    "c"
    "qwer"	    "we"
* */


public class Level01_20 {

    public static String solution(String s) {
        char[] chars = s.toCharArray();

        //주의 인덱스는 0부터 시작하는거 주의
        if (s.length() % 2 == 1) {
            int len = (s.length() / 2);
            char c = chars[len];

            return String.valueOf(c);
        } else {
            int len = (s.length() / 2) - 1;
            char c = chars[len];
            char c2 = chars[len+1];

            return String.valueOf(c) + String.valueOf(c2);
        }

    }
    public static String solution2(String s) {
        char[] chars = s.toCharArray();

        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);

    }



    public static void main(String[] args) {
        String s = "abcdeee";

        String result = Level01_20.solution(s);

        System.out.println(result);
    }



}
