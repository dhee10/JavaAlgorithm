package com.javaAlgorithm.algorithm.inflearn;
import java.util.*;

public class HashMap_02 {
    public String solution(String str1, String str2) {
        String result = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                result = "NO";
                break;
            } else {
                map.put(c,map.get(c) - 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        HashMap_02 T = new HashMap_02();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();
        System.out.println(T.solution(str1,str2));
    }
}
