package string;

import java.util.ArrayList;
import java.util.Scanner;

public class B02_ArrayList2 {
    public ArrayList<Integer> Test1(int[] arry, int cnt){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arry[0]);
        for(int i = 1; i < cnt-1; i++){
            if(arry[i] < arry[i+1]){
                result.add(arry[i+1]);
            }
        }
        return result;
    }
    public int Test2(int[] arry, int cnt){
        int result =1, max = arry[0];
        for(int i=1; i<cnt; i++){
            if(arry[i]>max){
                result++;
                max = arry[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        B02_ArrayList2 B = new B02_ArrayList2();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arry = new int[cnt];

        for(int i=0; i <cnt; i++){
            arry[i] = sc.nextInt();
        }


        B.Test1(arry,cnt);
        System.out.println("[1]"+B.Test1(arry,cnt).size());

        B.Test2(arry,cnt);
        System.out.print("[2]"+B.Test2(arry,cnt));



    }

}
