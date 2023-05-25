package com.javaAlgorithm.algorithm.focu;
// 삽입 정렬 예시
public class Insertion_sort {

    public static void main(String[] args) {
        int[] a = {5, 3, 1, 3, 4, 6, 2};

        for (int i = 0; i < a.length; i++) {
            int target = a[i];
            int j = i - 1;

            while (j > 0 && target < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            /*
            * 위 while 문에서 탈출 하는 경우 앞의 원소가 타겟보다 작다는 의미
            * 그러므로 타겟 원소는 j의 뒤 위치에 와야한다 = j+1
            * */

            a[j + 1] = target;
        }

    }
}
