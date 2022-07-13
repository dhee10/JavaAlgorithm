package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class D04_AllAnagram {
    public int sol(String a , String b ){
        int result =0;
        HashMap<Character,Integer> am = new HashMap<>();
        HashMap<Character,Integer> bm = new HashMap<>();

        for (char x: b.toCharArray()) bm.put(x, bm.getOrDefault(x,0)+1);

        int L = b.length()-1; //길이가 3이면 L = 2 까지 세팅해두기 (하나 빼고세팅)

        for (int i = 0; i < L; i++) {
            am.put(a.charAt(i),am.getOrDefault(a.charAt(i),0)+1); //키값이 있으면 가져오고 없으면 키값을 만들어 0을 넣어준다.
        }

        // 투포인트 알고리즘
        int lt =0;
        for (int rt = L; rt < a.length(); rt++) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt),0)+1);
            if(am.equals(bm)) result ++;
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));

        }

        return result;
    }

    public static void main(String[] args) {
        D04_AllAnagram T = new D04_AllAnagram();
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(T.sol(a,b));
    }
}
