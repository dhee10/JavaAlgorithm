package string;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

//stack형 자료구조.
//stack은 LIFO로 먼저들어간게 나중에 , 나중에 들어간게 먼저 나온다. (반대 되는 것은 큐 : 먼저들어간게 먼저나옴)
public class D06_Stack {
    public String sol(String str){
        String result = "YES";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()){
            if(x == '(') stack.push(x); // (일때는 스텍에 넣어주기
            else{ //')' 일 때
                if(stack.isEmpty())return "NO"; //스텍안에 짝꿍 '('가 존재하는지 확인
                stack.pop(); // 스텍안에 '('이 존재한다면, '('를 하나 씩 지워주기
            }
        }
        if(!stack.isEmpty()) return "NO"; // 스텍안에 자료가 남아있으면 '('가 많은 상황

        return result;
    }


    public static void main(String[] args) {
        D06_Stack T = new D06_Stack();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.sol(str));
    }
}
