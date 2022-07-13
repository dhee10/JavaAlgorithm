package string;

import java.util.Scanner;
import java.util.Stack;

//stack형 자료구조.
//stack은 LIFO로 먼저들어간게 나중에 , 나중에 들어간게 먼저 나온다. (반대 되는 것은 큐 : 먼저들어간게 먼저나옴)
public class E03_kakao {
    public int sol(int[][] board, int[] moves){
        int result = 0;
        Stack<Integer> stack = new Stack<>();

        for (int pos : moves){ //pos = 크레인의 위치
            for (int i = 0; i < board.length; i++) { //board.length = 행의 크기 (세로)
                if(board[i][pos-1]!=0){ //인형이 발견되면 (pos가 1이니까 0인덱스부터 하기위해 -1)
                    int tmp = board[i][pos-1]; //인형에다가 번호를 넣기
                    board[i][pos-1] = 0; // 인형을 가져가고 인형자리를 0으로 채우기
                    if(!stack.isEmpty() && tmp == stack.peek()){ //스택이 0이 아니고 스택의 맨 위 인형과 가져온 인형이 같으면
                        result +=2; //터지는 인형이2개니까 2개씩 터트리기
                        stack.pop();
                    } else{
                        stack.push(tmp);
                        break; //최상단 if문이 참이면 브레이크로 멈춰줘야함
                    }

                }
            }
        }


        return result;
    }


    public static void main(String[] args) {
        E03_kakao T = new E03_kakao();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] =in.nextInt();
            }
        }
        int m =in.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println(T.sol(board,moves));
        }
    }
}
