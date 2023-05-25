package com.javaAlgorithm.algorithm.programmers.level01;

/*
하샤드
양의 정수x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
예시 - 18 자릿수 수 1+8 =9 , 18%9 == 0 이므로 18은 하샤드 수

* */


import java.util.Scanner;

public class Level01_11 {
    public static boolean solution(int x) {
        // x의 각 자릿수 떼기
        String stringValue = String.valueOf(x);
        String[] stringArray = stringValue.split("");

        int total = 0;
        // 자리수를 다 더한 값%x 해서 =0 인지 확인
        for (String s : stringArray) {
            total += Integer.parseInt(s);
        }

        return (x % total == 0)? true:false;
    }
    public static boolean solution2(int x) {
        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum(); // ch - 0 = 아스키코드 이용
        return x % sum == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        boolean result = Level01_11.solution2(s);
        System.out.print(result);

    }


}
