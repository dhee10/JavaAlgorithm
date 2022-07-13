package string;

import java.util.Scanner;

public class A02 {
//    # 문제
//    대소문자는 소문자로 소문자는 대문자로
    public  String solution(String str){
        String answer ="";
        for(char x: str.toCharArray()){
            if (Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else  answer += Character.toLowerCase(x);
        }


        return answer;
    }
    public static void main (String[] args){
        A02 T = new A02();
        Scanner kb = new Scanner(System.in);
        System.out.println("문자열을 입력하세요");
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
