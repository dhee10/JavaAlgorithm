package string;

import java.util.Scanner;

public class C05_TwoPointers {
    public int sol(int n){
        int lt = 0, sum=0, result =0;
        int m = n/2+1;
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) arr[i]= i+1; //0번 인덱스 부터 1이 들어가게

        for (int rt = 0; rt < m; rt++) {
            sum+= arr[rt]; // sum = lt 부터 rt 까지의 합이 된다
            if(sum == n)result ++; // sum의 값이 목표값 n이 될 때 방법(result)추가
            while (sum>=n){ //sum이 목표값 보다 커지면
                sum-=arr[lt++]; // sum은 lt 값을 빼고 증가
                if(sum==n) result++; // 또 다시 sum이 목표값인지 확인
            }
        }
        return result;
    }

    public static void main(String[] args) {
        C05_TwoPointers T = new C05_TwoPointers();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //목표값


        System.out.println(T.sol(n));



    }
}
