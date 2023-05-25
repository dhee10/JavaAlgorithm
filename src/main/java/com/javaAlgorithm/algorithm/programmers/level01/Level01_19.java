package com.javaAlgorithm.algorithm.programmers.level01;

/*
#문제 설명
    정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
    단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
    예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

#제한 조건
    arr은 길이 1 이상인 배열입니다.
    인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

#입출력 예
    arr	return
    [4,3,2,1]	[4,3,2]
    [10]	[-1]
* */


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Level01_19 {

    public static int[] solution(int[] arr) {
        int[] siz0 = {-1};
        if (arr.length == 1) {
            return siz0;
        }

        int min =0;
        //list에 담기
        List<Integer> list = Arrays.stream(arr)
                            .boxed()
                            .collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                min = list.get(i);
            }

            min = min < list.get(i) ? min : list.get(i);
        }

        for (int i = 0; i < list.size(); i++) {
            if (min == list.get(i)) list.remove(i);
        }

        // list를 스트림으로 변환 후 mapToInt메소드를 사용해 Integer를 int로 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int[] arr) {
        if (arr.length <= 1) return new int[]{ -1 };
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};

        int[] result = Level01_19.solution(arr);

        for (int i : result) {
            System.out.print(i);
        }
        System.out.println();
    }



}
