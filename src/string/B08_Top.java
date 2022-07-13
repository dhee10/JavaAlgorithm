package string;

import java.util.Scanner;

public class B08_Top {


    public int[]  Test1(int total, int[] arry){
        int [] result = new int[total];

        for(int i=0; i<total; i++){
            int cnt =1; // 처음은 항상 1등
            for(int j=0; j<total; j++){
                if(arry[i] < arry[j]) cnt++;
            }
            result[i] = cnt;
        }
        return result;
    }
    public static void main(String[] args) {
        B08_Top sol = new B08_Top();
        Scanner in=new Scanner(System.in);
        int total = in.nextInt();
        int[] arry = new int[total];

        for(int i=0; i<total; i++){
            arry[i] =in.nextInt();
        }
        for (int i:sol.Test1(total,arry)) {
            System.out.print(i);
        }
    }

}
