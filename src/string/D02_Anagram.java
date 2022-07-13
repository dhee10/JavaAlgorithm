package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class D02_Anagram {
    public String sol(String a , String b){
        String result ="YES";
        HashMap<Character,Integer> map =new LinkedHashMap<>();
        for (char x : a.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char x : b.toCharArray()){
            if(!map.containsKey(x) || map.get(x) == 0){
                return "NO"; //같은 알파벳이 없거나(키값이없거나) , 벨류의 수가 0이면 no 리턴
            }
            map.put(x,map.get(x)-1); //같은 알파벳이 있으면 빼주기
        }

        return result;
    }

    public static void main(String[] args) {
        D02_Anagram T = new D02_Anagram();
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(T.sol(a,b));



    }
}
