package string;

import java.util.Scanner;

public class B09_MaxSum {
    public int max (int cnt, int[][] arr){
        int result = Integer.MIN_VALUE;
        int cal;
        int span;

        for(int i =0; i<cnt; i++){
            cal = 0;
            span = 0;
            for(int j=0; j<cnt; j++){
                cal +=arr[i][j]; // 행(cal)은 고정
                span +=arr[j][i]; // 열(span)은 고정
            }
            result=Math.max(result,cal);
            result=Math.max(result,span);
        }

        cal =0;
        span =0;
        for (int i =0; i<cnt; i++){
            cal+= arr[i][i];
            span += arr[i][cnt-i-1];
            result=Math.max(result,cal);
            result=Math.max(result,span);
        }

        return result;
    }

    public static void main(String[] args) {
        B09_MaxSum sol = new B09_MaxSum();
        Scanner in=new Scanner(System.in);
        int cnt = in.nextInt();
        int[][] arr = new int[cnt][cnt];

        for (int i=0; i<cnt; i++){
            for(int j=0; j<cnt; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.print(sol.max(cnt,arr));
    }

}

