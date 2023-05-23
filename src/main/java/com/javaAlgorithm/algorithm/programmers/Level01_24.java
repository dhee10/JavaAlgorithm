package com.javaAlgorithm.algorithm.programmers;

/*
#문제 설명
    두 정수 left와 right가 매개변수로 주어집니다.
    left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
    약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

#제한사항
    1 ≤ left ≤ right ≤ 1,000
    입출력 예
    left	right	result
    13	17	43
    24	27	52

#입출력 예 설명
    [입출력 예 #1]

    다음 표는 13부터 17까지의 수들의 약수를 모두 나타낸 것입니다.
    수	    약수	        약수의 개수
    13	    1,13            2
    14	    1,2,7,14	    4
    15	    1,3,5,15	    4
    16	    1,2,4,8,16	    5
    17	    1,17	        2
    따라서, 13 + 14 + 15 - 16 + 17 = 43을 return 해야 합니다.
* */


import java.util.ArrayList;
import java.util.Arrays;

public class Level01_24 {

    public static int solution(int left, int right) {
        int answer = 0;
        int start = 0;
        int end = 0;
        if (left > right) {
            start = right;
            end = left;
        } else {
            start = left;
            end = right;
        }

        for (int i = start; i <= end; i++) {
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    list.add(j);
                }
            }

            answer = (list.size() % 2 == 0) ? answer + i: answer - i;

        }
        return answer;
    }

    public static int solution2(int left, int right) {
        int answer = 0;
        int start = 0;
        int end = 0;
        if (left > right) {
            start = right;
            end = left;
        } else {
            start = left;
            end = right;
        }

        for (int i = start; i < end; i++) {
            // 제곱수인 경우 약수의 갯수가 홀수이다
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            } else {
                answer += i;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int left = 24;
        int right = 27;

        int result = Level01_24.solution(left,right);

        System.out.println(result);
    }



}
