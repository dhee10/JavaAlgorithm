package com.javaAlgorithm.algorithm.programmers;

/*
0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.


입출력 예
numbers	result
[1,2,3,4,6,7,8,0]	14
[5,8,4,0,6,7,9]	6

* */


import java.util.Arrays;
import java.util.Scanner;

public class Level01_18 {

    public static int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            answer = answer + numbers[i];
        }

        // 0~9까지 더한 값 - numbers에 있는 수 들의 합 = 배열에 있지 않은 수의 합
        return answer = 45 - answer;
    }



    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};

        int result = Level01_18.solution(numbers);

        System.out.println(result);
    }



}
