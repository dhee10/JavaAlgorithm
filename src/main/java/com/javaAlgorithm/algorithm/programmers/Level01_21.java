package com.javaAlgorithm.algorithm.programmers;

/*
#문제설명
    길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수,
    solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

#제한 조건
    n은 길이 10,000이하인 자연수입니다.

#입출력 예
    n	return
    3	"수박수"
    4	"수박수박"
* */


public class Level01_21 {

    public static String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            answer += (i % 2 == 0) ? "수" : "박";
        }
        return answer;
    }

    public static String solution2(int n) {
        /*
        [n / 2 + 1] => 길이: n = 3이면 길이 2의 빈 문자열 생성, n이 4이면 길이 3의 빈 문자열을 만든다.
        여기에서 빈 문자열을 넣어주는 것은 (\0 => 널 문자)를 사용한다.
        빈 문자열은 replace를 이용해 "수박"으로 채워지는데 길이가 2인 문자열은 수박으로 길이가 3인 문자열은 수박수로
        0 부터 n까지 잘라준다.
        */
        return new String(new char[n / 2 + 1]).replace("\0", "수박").substring(0, n);
    }

    public static void main(String[] args) {
        int n = 3;

        String result = Level01_21.solution(n);

        System.out.println(result);
    }



}
