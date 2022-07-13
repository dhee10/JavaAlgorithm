package string;

import java.util.Scanner;
import java.util.Stack;

//stack형 자료구조.
//stack은 LIFO로 먼저들어간게 나중에 , 나중에 들어간게 먼저 나온다. (반대 되는 것은 큐 : 먼저들어간게 먼저나옴)
public class E02_StackABC {
    public String sol(String str){
        String result = "";
        Stack<Character> stack = new Stack<>();

        for(char i:str.toCharArray()){
            if(i==')'){
                while (stack.pop() !='(');
            } else {
                stack.push(i);
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            result+=stack.get(i);
        }
        return result;
    }


    public static void main(String[] args) {
        E02_StackABC T = new E02_StackABC();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.sol(str));
    }
}
