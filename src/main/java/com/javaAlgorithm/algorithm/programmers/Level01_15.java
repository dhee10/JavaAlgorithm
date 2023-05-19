package com.javaAlgorithm.algorithm.programmers;

/*
String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

* */


import java.util.Arrays;
import java.util.Scanner;

public class Level01_11 {

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

        int[] result result = Level01_15.solution2(arr,divisor);
        for (int i : result) {
            System.out.print(i+" ");
        }

    }


}
