package com.javaAlgorithm.algorithm.programmers.level01;

/*
#문제 설명
    두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
    배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
    예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

#제한 사항
    두 수는 1이상 1000000이하의 자연수입니다.

#입출력 예
    n	m	return
    3	12	[3, 12]
    2	5	[1, 10]
    입출력 예 설명
    입출력 예 #1
    위의 설명과 같습니다.

#입출력 예 #2
    자연수 2와 5의 최대공약수는 1, 최소공배수는 10이므로 [1, 10]을 리턴해야 합니다.
* */


import java.util.Scanner;
import java.util.stream.IntStream;

public class Level01_29 {
    /* 유클리드 호제법
       n,m의 최대공약수는 r = 0 이 되는 시점에서 m이다.
    * */
    public static int gcd(int n, int m) {
        int r;
        while (m > 0) {
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        if (n < m) {
            int temp = n;
            n = m;
            m = temp;
        }
        //최대공약수
        answer[0] = gcd(n, m);

        //최소공배수 (두 수의 곱 / 두 수의 최대공약수)
        answer[1] = (n * m) / answer[0];

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 12;


        int[] solution = solution(n, m);
        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i]+"  ");
        }


    }



}
