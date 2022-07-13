package string;

import java.util.ArrayList;
import java.util.Scanner;

public class B06_MinorityReverse {
    public boolean  Test1(int num){
        if(num==1) return false;
        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        B06_MinorityReverse sol = new B06_MinorityReverse();
        Scanner in=new Scanner(System.in);
        int cnt = in.nextInt();
        ArrayList<Integer> arry = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i=0; i<cnt; i++){
            String base = in.next();
            base = base.replaceAll("[^0-9]","");
            StringBuffer bf = new StringBuffer(base);
            base = bf.reverse().toString();

            arry.add(Integer.parseInt(base));
        }

        for(int i=0; i<cnt; i++){
            int num = arry.get(i);
            if(sol.Test1(num) == true){
                result.add(num);
            }
        }

        System.out.print(result);


    }

}
