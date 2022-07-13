package string;

import java.util.Scanner;

public class A12_subString {
    public String Test1(String str,int cnt){
        String result = "";
        String base = "";
        for (int i=0; i<cnt; i++){
            base = str.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(base,2);
            result+=(char)num;
            str = str.substring(7);
        }



        return result;
    }
    public static void main(String[] args) {
        A12_subString A = new A12_subString();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int cnt = sc.nextInt();
        System.out.println(A.Test1(str,cnt));


    }

}
