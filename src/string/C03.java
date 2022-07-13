package string;

import java.util.Scanner;

public class C03 {
    public int sol(int[] arr, int checkDate){
        int base = 0;

        for(int i=0; i < arr.length-(checkDate-1); i++){
            if(base < arr[i]+arr[i+1]+arr[i+2]){
                base = arr[i]+arr[i+1]+arr[i+2];
            }
        }

        return base;
    }

    public static void main(String[] args) {
        C03 T = new C03();
        Scanner in = new Scanner(System.in);
        int date = in.nextInt();
        int checkDate = in.nextInt();

        int[] arr = new int[date];
        for (int i=0; i< arr.length ; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(T.sol(arr,checkDate));



    }
}
