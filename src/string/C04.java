package string;

import java.util.Scanner;

public class C04{
    public int sol(int[] arr, int num){
        int point = 0;

        for (int i = 0; i < arr.length; i++) {
            int base = arr[i];
            for (int j = (i+1); j < arr.length; j++) {
                if(base < num){
                     base += arr[j];
                }else if(base == num){
                    point ++;
                    break;
                }else{
                    break;
                }
            }
        }


        return point;
    }

    public static void main(String[] args) {
        C04 T = new C04();
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt(); //총갯수
        int num = in.nextInt(); //특정 숫자 (합)

        int[] arr = new int[cnt];
        for (int i=0; i< arr.length ; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(T.sol(arr,num));



    }
}
