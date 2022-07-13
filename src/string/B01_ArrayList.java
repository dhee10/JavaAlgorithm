package string;

import java.util.ArrayList;
import java.util.Scanner;

public class B01_ArrayList {
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
    public static void main(String[] args) {
        B01_ArrayList B = new B01_ArrayList();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arry = new int[cnt];

        for(int i=0; i <cnt; i++){
            arry[i] = sc.nextInt();
        }

        for(int i:B.Test1(arry,cnt)){
            System.out.println(i);
        }


    }

}
