package string;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//큐의 자료구조.
//먼저들어간게 먼저나오는 구조
public class E08_Queue3_ClassMake {
    public String sol(String compulsory,String plan){
        String result = "yes";
        Queue<Character> q = new LinkedList<>();

        for(char x:compulsory.toCharArray()) q.add(x);

        for(char x:plan.toCharArray()) {
            //contains = q에 있는지 없는지 확인해줌
            if(q.contains(x)){
                // x가 q의 맨앞 데이터랑 다르면 잘못짠 것
                 if(x!=q.poll()) return "no";
            }
        }
        if(!q.isEmpty()) return "no"; //필수과목이 q에 남아있으면 이수 안함함

       return result;
    }


    public static void main(String[] args) {
        E08_Queue3_ClassMake T = new E08_Queue3_ClassMake();
        Scanner in = new Scanner(System.in);
        String compulsory = in.next();
        String plan = in.next();
        System.out.println(T.sol(compulsory,plan));
    }
}
