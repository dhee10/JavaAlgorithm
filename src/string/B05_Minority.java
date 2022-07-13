package string;

import java.util.ArrayList;
import java.util.Scanner;

public class B05_Minority {
    public int Test1(int num){
        int result=0;
        int[] check = new int[num+1];
        for (int i=2; i<num; i++){
            if(check[i] ==0){
                result++;
                for(int j =i; j<num; j=j+i){ //num의 배수 씩 증가
                    check[j]=1;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        B05_Minority sol = new B05_Minority();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(sol.Test1(num));


    }

}
