package string;

import java.util.Scanner;

public class A06 {
    public String test(String str){
        str.toLowerCase();
        String result ="";

        for(int i = 0; i <str.length(); i++){

            if(i == str.indexOf(str.charAt(i))){
                result += str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        A06 A = new A06();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();

        System.out.println(A.test(str));
    }
}
