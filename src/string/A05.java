package string;

import java.util.Scanner;

public class A05 {
    public String test(String str){
        String result ="";
        char[] cha = str.toCharArray();
        char change ;
        int start =0;
        int end =str.length()-1;

        while (start<end){
            if(!Character.isAlphabetic(cha[start])) start++;
            else if(!Character.isAlphabetic(cha[end])) end--;
            else{
                change = cha[start];
                cha[start] = cha[end];
                cha[end] =change;
                start ++;
                end --;
            }
        }
        result = String.valueOf(cha);


        return result;
    }
    public static void main(String[] args) {
        A05 A = new A05();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();

        System.out.println(A.test(str));


    }
}
