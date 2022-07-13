package string;
import java.util.Arrays;
import java.util.Scanner;

public class F05_OverlapCheck {
    public char sol(int n, int[] arr) {
        char result = 'U';
        Arrays.sort(arr);
        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i + 1]) {
                return 'D';
            }
        }
        return result;
    }
    public static void main(String[] args) {
        F05_OverlapCheck T = new F05_OverlapCheck();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.sol(n,arr));
    }
}
