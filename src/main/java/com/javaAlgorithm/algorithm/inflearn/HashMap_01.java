package com.javaAlgorithm.algorithm.inflearn;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_01 {
    public char solution(int n, String str) {
        char result = ' ';

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int num = Integer.MIN_VALUE;
        for(char c: map.keySet()){
            if (num < map.get(c)) {
                num = map.get(c);
                result = c;
            }
        }



        return result;

    }

    public static void main(String[] args) {
        HashMap_01 T = new HashMap_01();
        java.util.Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n,str));
    }
}
