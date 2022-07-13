package string;

import java.util.Scanner;

public class A07 {
    public String test(String str){
        String result ;
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(str+"  "+rev);
        if (str.equalsIgnoreCase(rev)) {
           result = "yes";
        }
        else{result = "no";
        }
        return result;
    }
    public static void main(String[] args) {
        A07 A = new A07();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();

        System.out.println(A.test(str));
    }
}
