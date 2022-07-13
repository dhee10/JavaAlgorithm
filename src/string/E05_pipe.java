package string;

import java.util.Scanner;
import java.util.Stack;

//stack형 자료구조.
//stack은 LIFO로 먼저들어간게 나중에 , 나중에 들어간게 먼저 나온다. (반대 되는 것은 큐 : 먼저들어간게 먼저나옴)
public class E05_pipe {
    public int sol(String str){
        int result = 0;
        Stack<Character> stack = new Stack<>();
        //닫는 괄호일 때 앞에가 여는괄호인지 확인하기위해 index로 접근 포문
        for (int i = 0; i < str.length(); i++) {
            //여는 괄호 일 때는 스택에 푸시해준다
            if(str.charAt(i)=='(') stack.push('(');
            else { // 닫는 괄호일 때
                stack.pop(); //짝꿍 여는 괄호 하나 빼고
                if(str.charAt(i-1)=='(') result +=stack.size();
                //직전 괄호가 여는 괄호 일 때는 레이저이기 때문에 자른다(스택의 사이즈 만큼 파이프가 생김)
                else result++; // 직전 괄호가 닫는 괄호 일때는 막대기의 끝이기 때문에 1개(나머지막대기)만 추가해줌
            }
        }

        return result;
    }


    public static void main(String[] args) {
        E05_pipe T = new E05_pipe();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.sol(str));
    }
}
