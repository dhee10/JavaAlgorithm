package string;

import java.util.ArrayList;
import java.util.Scanner;

public class B03_RockPaperScissors {
    public ArrayList<String> Test1(int[] A, int[] B, int cnt){
        ArrayList<String> result = new ArrayList<>();
        boolean D = false;

        for (int i=0; i <cnt; i++){
            if (A[i] == B[i]) {
                result.add("D");
                D = true;
            }else{
                if(A[i] == 1){
                    if(B[i] == 2) result.add("B");
                    else if(B[i] == 3) result.add("A");
                }else if(A[i] == 2){
                    if(B[i] == 1) result.add("A");
                    else if(B[i] == 3) result.add("B");
                }else if(A[i] == 3){
                    if(B[i] == 1) result.add("B");
                    else if(B[i] == 2) result.add("A");
                }
                D = false;
            }
        }
        return result;
    }
    public ArrayList<String> Test2(int[] A, int[] B, int cnt){
        ArrayList<String> result = new ArrayList<>();
        for(int i=0; i<cnt; i++){
            if(A[i]==B[i]) result.add("D");
            else if(A[i]==1 && B[i]==3) result.add("A");
            else if(A[i]==2 && B[i]==1) result.add("A");
            else if(A[i]==3 && B[i]==2) result.add("A");
            else result.add("B");
        }


        return result;
    }
    public static void main(String[] args) {
        B03_RockPaperScissors sol = new B03_RockPaperScissors();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] A = new int[cnt];
        int[] B = new int[cnt];

        for(int i=0; i <cnt; i++){
            A[i] = sc.nextInt();
        }
        for(int i=0; i <cnt; i++){
            B[i] = sc.nextInt();
        }

        System.out.println("1번째:"+sol.Test1(A,B,cnt));
        System.out.println("2번째:"+sol.Test2(A,B,cnt));




    }

}
