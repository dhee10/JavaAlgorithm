package com.javaAlgorithm.algorithm.programmers;

/*
하샤드
양의 정수x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
예시 - 18 자릿수 수 1+8 =9 , 18%9 == 0 이므로 18은 하샤드 수

* */


import java.util.Arrays;
import java.util.Scanner;

public class Level01_11 {
    public static long solution(long s) {
        String[] list = String.valueOf(s).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String l : list) {
            sb.append(l);
        }
        return Long.parseLong(sb.reverse().toString());
    }

    public static long solution2(long n) {
        String answer = "";
        String str = Long.toString(n);

        int[] arr = new int[str.length()];

        //long타입의 숫자를 Int배열로 올긴다.
        for(int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i+1);
            arr[i] = Integer.parseInt(s);
        }

        //내림차순 정렬
        for(int j = 0; j < str.length()-1; j++){
            for(int i = 0; i < str.length()-1; i++) {
                if (arr[i] < arr[i+1]) {
                    int tmp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        for(int i = 0; i < str.length(); i++){
            answer += arr[i];
        }

        return Long.parseLong(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();

        long result = Level01_11.solution2(s);
        System.out.print(result);

    }


}
