package string;

import java.util.Scanner;

public class A11 {
    public String Test1(String str){
        String result = "";
        str = str+"";
        int cnt =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==str.charAt(i+1)) cnt++;
            else{
                result += str.charAt(i);
                if(cnt>1) result += Integer.toString(cnt);
                cnt=1;
            }
        }


        return result;
    }
    public static void main(String[] args) {
        A11 A = new A11();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.println(A.Test1(str));


    }

}
