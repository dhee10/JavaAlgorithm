package string;

import java.util.Scanner;

public class F01_SelectionSort {
    public int[] sol(int n, int[] arr) {
        for (int i = 0; i < n-1; i++) {
            int idx = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
    return arr;
    }
    public static void main(String[] args) {
        F01_SelectionSort Test = new F01_SelectionSort();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int x: Test.sol(n,arr)) System.out.println(x+" ");
    }
}
