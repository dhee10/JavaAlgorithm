package string;

import java.util.Scanner;

public class A10 {
    public int[] Test1(String str,char c){
        int[] result = new int[str.length()];
        int point = 10000;
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i)==c){
                point = 0;
                result[i] = point;
            }else{
                point ++;
                result[i] = point;
            }
        }
        point=10000;
        for(int i= str.length()-1; i>0; i--){
            if(str.charAt(i)==c){
                point = 0;
                result[i] = point;
            }else{
                point ++;
                result[i] = point;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        A10 A = new A10();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        char c= sc.next().charAt(0);

        for (int i : A.Test1(str,c)){
            System.out.println();
        }

    }

}
