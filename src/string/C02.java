package string;

import java.util.*;

public class C02 {
    public List<Integer> sol(Integer[] arr1, Integer[] arr2){
        List<Integer> list1 =new ArrayList<>(Arrays.asList(arr1));
        List<Integer> list2 =new ArrayList<>(Arrays.asList(arr2));

        list1.retainAll(list2);

        Collections.sort(list1);

        return list1;
    }


    public static void main(String[] args) {
        C02 T = new C02();
        Scanner in = new Scanner(System.in);
        Integer arr1_size = in.nextInt();
        Integer[] arr1 = new Integer[arr1_size];
        for(int i =0; i< arr1_size; i++){
            arr1[i] = in.nextInt();
        }

        Integer arr2_size = in.nextInt();
        Integer[] arr2 = new Integer[arr2_size];
        for(int i =0; i< arr2_size; i++){
            arr2[i] = in.nextInt();
        }

        System.out.println(T.sol(arr1,arr2));


    }
}
