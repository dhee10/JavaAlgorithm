package string;

import java.util.*;

public class A01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("문자열을 입력하세요");
        String str = scn.next().toUpperCase();
        System.out.println("어떤 문자의 갯수를 추출할까요?");
        char c = scn.next().toUpperCase().charAt(0);

        int cnt = (int) str.chars().filter(f->f == c).count();

        System.out.println(cnt);

    }
}
