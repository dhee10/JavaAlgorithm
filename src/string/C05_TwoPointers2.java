package string;

import java.util.Scanner;

public class C05_TwoPointers2 {
    public int sol(int n){
        int result =0, cnt =1; //cnt 는 연속된 자연수의 갯수
        n--; // n에서 두개의 수를 비교해 줘야하기 때문에 먼저 n-1을 해준다 (두 수를 빼야함)

        while(n>0){
            cnt++; // n에서 두번째 수 빼주기 -> 다음 while문에는 3자릿수 -> 증가증가
            n=n-cnt;
            if(n%cnt ==0) result++;
                System.out.print(n+"    "+cnt);
        }
         return result;
    }

    public static void main(String[] args) {
        C05_TwoPointers2 T = new C05_TwoPointers2();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //목표값


        System.out.println(T.sol(n));



    }
}
