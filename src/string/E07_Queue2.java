package string;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//큐의 자료구조.
//먼저들어간게 먼저나오는 구조
public class E07_Queue2 {
    public int sol(int prince,int num){
        int result = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < prince; i++) {
            while (!q.isEmpty()){
                for (int j = 0; j < num; j++) {
                    q.offer(q.poll()); //앞에껄 꺼내서 뒤에다 넣어준다.
                }
                q.poll(); // num이랑 같아지면 poll해서 뺀다
                if(q.size()==1) result = q.poll();
            }
        }
        return result;
    }


    public static void main(String[] args) {
        E07_Queue2 T = new E07_Queue2();
        Scanner in = new Scanner(System.in);
        int prince = in.nextInt();
        int num = in.nextInt();
        System.out.println(T.sol(prince,num));
    }
}
