package com.javaAlgorithm.algorithm.programmers;

/*
문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

* */


import java.util.Scanner;

public class Level01_09 {
    public static int solution(String s) {
        int sign = 1;
        int answer = 0;

        //음수 일 때 처리
        if (s.charAt(0) == '-') {
            sign = -1;
            s = s.substring(1); //-를 뺀 나머지 숫자 추출
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int asciiCode = (int) (ch - '0'); // 0의 아스키코드인 48을 빼주면 해당 숫자값을 얻을 수 있음
            answer = answer * 10 + asciiCode;
        }

        return answer *= sign; //부호를 곱해 정수값에 부호를 적용 sign = 1인경우 양수 , -1인경우 음수
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int result = Level01_09.solution(s);
        System.out.print(result);

    }


}
