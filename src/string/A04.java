package string;

import java.util.ArrayList;
import java.util.Scanner;

public class A04 {
    public ArrayList<String> solution (int n,String[] str) {
        ArrayList<String> result = new ArrayList<>();

        for (String p : result) {
            String tmp = new StringBuilder(p).reverse().toString();
            result.add(tmp);

        }

        return result;
    }
    public static void main(String[] args) {
        A04 S = new A04();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i=0; i<n; i++){
            str[i]=sc.next();
        }
        for(String p : S.solution(n,str)){
            System.out.println(p);
        }
    }
}
