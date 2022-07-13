package string;

import java.util.Scanner;

public class A03 {

    public String solution (String sen) {
        String result = "";
        int m = Integer.MIN_VALUE;
        String[] s=sen.split(" ");

        for(String w : s) {
            int len = w.length();
            if(len>m){
                m=len;
                result=w;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        A03 S = new A03();

        Scanner scn = new Scanner(System.in);
        String sen = scn.nextLine();

        System.out.println(S.solution(sen));
    }
}
