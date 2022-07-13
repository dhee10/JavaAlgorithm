package string;

import java.util.Scanner;

public class C06 {
    public int sol(int n,int k, int[] arr){
        int result =0;
        int cnt = 0; //0을 1로 바꾼 횟수
        int lt =0;
        for (int rt = 0; rt < n; rt++) {
            if(arr[rt]==0) cnt++;
            while (cnt > k){
                if(arr[lt]==0) cnt--; // 0을 1로 바꾼 횟수가 꽉 차면 다시 --
                lt++; //lt를 올리면서 찾아준다
            }
            result =Math.max(result, rt-lt+1);

        }

        return result;
    }

    public static void main(String[] args) {
        C06 T = new C06();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //목표값
        int k = in.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }

        System.out.print(T.sol(n,k,arr));
    }
}
