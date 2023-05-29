package com.javaAlgorithm.algorithm.focu;

import java.util.Arrays;
import java.util.Random;

// 배열 요소의 최소 차이 찾기
/* 1. 정렬을 사용하지 않으면 가장 빠른 방법은 모든 수 쌍마다 그 차이를 구하는 것
         -시간 복잡도 O(n^2)
   2. 정렬을 하면 시간 복잡도는 O(n log(n))로 줄일 수 있다.

* */
public class Program {
    public static void main(String[] args) {
        Random random = new Random(512);

        // 무작위로 값 넣어주기
        int[] nums = new int[15];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1000);
        }

        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE; //정수의 최댓값
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < nums.length; i++) {
            int diff = Math.abs(nums[i] - nums[i + 1]); // 절대값 반환

           if (diff < minDiff) {
               minDiff = diff;
               num1 = nums[i];
               num2 = nums[i + 1];
           }
        }
        System.out.println(String.format("minimum : %d", minDiff));
        System.out.println(String.format("num1: %d, num: %d",num1,num2));


    }



}
