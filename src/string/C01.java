package string;

import java.util.*;

public class C01 {
    public int[] arraycopy(int[] arr1, int[] arr2){
        //1.arraycopy 사용하기
        int destSize = arr1.length+ arr2.length;
        int[] result = new int[destSize];

        System.arraycopy(arr1,0,result,0,arr1.length);
        System.arraycopy(arr2,0,result,arr1.length,arr2.length);
        Arrays.sort(result);

        return result;
    }

    public List<Integer> listType(int[] arr1, int[] arr2){
        List<Integer> list = new ArrayList<>();
        for (int i=0; i< arr1.length; i++){
            list.add(arr1[i]);
        }
        for (int i=0; i< arr2.length; i++){
            list.add(arr2[i]);
        }
        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {
        C01 T = new C01();
        Scanner in=new Scanner(System.in);
        int arr1_size = in.nextInt();
        int[] arr1 = new int[arr1_size];
        for(int i =0; i< arr1_size; i++){
            arr1[i] = in.nextInt();
        }

        int arr2_size = in.nextInt();
        int[] arr2 = new int[arr2_size];
        for(int i =0; i< arr2_size; i++){
            arr2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(T.arraycopy(arr1,arr2)));
        System.out.println(T.listType(arr1,arr2));

    }
}
