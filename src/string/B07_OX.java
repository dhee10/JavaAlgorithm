package string;

import java.util.ArrayList;
import java.util.Scanner;

public class B07_OX {


    public int  Test1(int total, int[] arry){
        int result =0;
        int cnt = 0;
        for(int i=0; i<total; i++){
            if(arry[i] ==1){
                cnt++;
                result+=cnt;
            }else{
                cnt = 0;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        B07_OX sol = new B07_OX();
        Scanner in=new Scanner(System.in);
        int total = in.nextInt();
        int[] arry = new int[total];

        for(int i=0; i<total; i++){
            arry[i] =in.nextInt();
        }
        System.out.print(sol.Test1(total,arry));

    }

}
