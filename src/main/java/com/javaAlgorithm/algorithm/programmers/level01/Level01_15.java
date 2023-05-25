package com.javaAlgorithm.algorithm.programmers.level01;

/*
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요

예시
arr	            divisor	  return
[5, 9, 7, 10]   	5	  [5, 10]
* */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Level01_15 {

    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList();

        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        } else {
            Collections.sort(list);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static int[] solution2(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(fa -> fa % divisor == 0).toArray();

        if (answer.length == 0) {
            answer = new int[]{-1};
        }
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        int[] result = Level01_15.solution2(arr,divisor);
        for (int i : result) {
            System.out.print(i+" ");
        }

    }


}
