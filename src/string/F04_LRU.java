package string;
import java.util.Scanner;

public class F04_LRU {
    public int[] sol(int cacheSize, int n, int[] arr) {
        int[] cache = new int[cacheSize];

        for (int x : arr) {
            int pos = -1; //인텍스 번호 (캐시안에 해당값이 없을경우 = 미스 )
            
            // 히트인지 확인하기
            for (int i = 0; i < cacheSize; i++) {
                if (x == cache[i]) pos = i; //x값이 캐시 배열안에 이미 존재 할 때 히트
            }

            // 히트가 아닐경우 = 미스
            if (pos == -1) {
                //미스 일 경우 사이즈-1 부터 시작해서 작아지면서 (1까지)
                for (int i = cacheSize - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1]; //하나씩 땡겨주기
                }
            } else {
                //히트일 경우
                for (int i = pos ; i >= 1; i--) { // 히트난 지점부터
                    cache[i] = cache[i - 1]; //하나씩 땡겨주기
                }
            }
            cache[0] = x; // 마지막으로 0번 인덱스에는 해당 값 넣어주기

            
        }
        return arr;
    }
    public static void main(String[] args) {
        F04_LRU T = new F04_LRU();
        Scanner sc = new Scanner(System.in);
        int cacheSize = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x: T.sol(cacheSize,n,arr))System.out.println(x+" ");
    }
}
