package string;

import java.util.Scanner;

public class A08 {
    public String test(String str){
        String result ;
        String base = "";
        String rev = "";
        char[] cha = str.toCharArray();

        for (int i =0; i <str.length(); i++){
            if(Character.isAlphabetic(cha[i])){
                base += str.charAt(i);
            }
        }
        rev = new StringBuilder(base).reverse().toString();

        if (base.equalsIgnoreCase(rev)) result = "yes";
        else result = "no";

        return result;
    }
    public static void main(String[] args) {
        A08 A = new A08();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();

        System.out.println(A.test(str));
    }
}
