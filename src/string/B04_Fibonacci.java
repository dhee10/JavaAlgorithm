package string;

import java.util.ArrayList;
import java.util.Scanner;

public class B04_Fibonacci {
    public ArrayList<Integer> Test1(int cnt){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i =0; i<cnt; i++){
            if(i < 2){
                result.add(1);
            }else{
                int num1 = result.get((i-2));
                int num2 = result.get((i-1));
                result.add((num1+num2));
            }
        }
        return result;
    }
    public int[] test2(int cnt){
        int[] result = new int[cnt];
        for (int i =0; i <cnt ; i ++){
            if(i <2) {
                result[i] = 1;
            }else {
                result[i] = result[i-2] + result[i-1];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        B04_Fibonacci sol = new B04_Fibonacci();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        System.out.println(sol.Test1(cnt));

        for (int i:sol.test2(cnt)) {
            System.out.print(i+" ");
        }



    }

}
