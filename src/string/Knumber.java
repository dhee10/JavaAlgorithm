package string;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class Knumber {
    public int sol(int[] arr,int n,int k) {
        int result =-1;
        TreeSet<Integer> Test = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    Test.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        int cnt =0;
        for(int x : Test){
            cnt ++;
            if(cnt ==k) return x;
        }
        return result;
    }


    public static void main(String[] args) {
        Knumber T = new Knumber();
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int k =in.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

    }
}
