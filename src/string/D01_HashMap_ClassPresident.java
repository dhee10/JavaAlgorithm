package string;

import java.util.HashMap;
import java.util.Scanner;

public class D01_HashMap_ClassPresident {
    public char sol(int n , String str){
        char result = ' ';
        int max = Integer.MIN_VALUE;
        HashMap<Character,Integer> map = new HashMap<>(); // 키값 Character , 벨류는 int

        for (char x:str.toCharArray()) {
            map.put(x, map.getOrDefault(x,0)+1); // 카운트 시 key 값이 없으면 디폴트로 0을 만들어주고 +1을해준다
        }
        System.out.println(map.containsKey('A')); //A라는 키가 있으면 true
        System.out.println(map.size()); //key의 갯수
        System.out.println(map.remove('A')); //A라는 키 삭제제

        for(char key:map.keySet()){
            System.out.println(key+" "+map.get(key));
            if(map.get(key) >max){
                max =map.get(key);
                result = key;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        D01_HashMap_ClassPresident T = new D01_HashMap_ClassPresident();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 학생수
        String str = in.next(); //투표 결과
        System.out.println(T.sol(n,str));



    }
}
