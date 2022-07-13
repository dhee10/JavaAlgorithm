package string;

import java.util.Scanner;
import java.util.Stack;

//stack형 자료구조.
//stack은 LIFO로 먼저들어간게 나중에 , 나중에 들어간게 먼저 나온다. (반대 되는 것은 큐 : 먼저들어간게 먼저나옴)
public class E04_postfix {
    public int sol(String str){
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x:str.toCharArray()){
            if (Character.isDigit(x)) stack.push(x-48); //x가 아스키넘버이므로
            else{
                int rt = stack.pop();
                int lt = stack.pop();
                if(x =='+') stack.push(lt+rt);
                else if(x=='-') stack.push(lt - rt);
                else if(x=='*') stack.push(lt * rt);
                else if(x=='/') stack.push(lt / rt);

            }
        }
        result =stack.get(0);

        return result;
    }


    public static void main(String[] args) {
        E04_postfix T = new E04_postfix();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.sol(str));
    }
}
