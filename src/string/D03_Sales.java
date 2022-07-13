package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class D03_Sales {
    public ArrayList<Integer> sol(int a , int b, int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> HM = new HashMap<>();

        for (int i = 0; i < b-1 ; i++) { //하루 작게 미리셋팅하기
            HM.put(arr[i],HM.getOrDefault(arr[i],0)+1);
        }

        int lt=0;
        for (int rt = b-1; rt < a; rt++) {
            HM.put(arr[rt],HM.getOrDefault(arr[rt],0)+1);
            result.add(HM.size());
            HM.put(arr[lt],HM.get(arr[lt])-1);
            if(HM.get(arr[lt])==0){
                HM.remove(arr[lt]);
                lt++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        D03_Sales T = new D03_Sales();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(); // 총 일수
        int b = in.nextInt(); // 연속된 일 수
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        for(int x : T. sol(a,b, arr)) System.out.println(x+" ");




    }
}
