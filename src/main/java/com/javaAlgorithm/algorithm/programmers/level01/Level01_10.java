package com.javaAlgorithm.algorithm.programmers.level01;

/*
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
예를들어 n이 118372면 873211을 리턴하면 됩니다.

* */


import java.util.Arrays;
import java.util.Scanner;

public class Level01_10 {
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

        long result = Level01_10.solution2(s);
        System.out.print(result);

    }


}
