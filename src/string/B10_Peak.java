package string;

import java.util.Scanner;

public class B10_Peak {
    public int max (int cnt, int[][] arr){
        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};
        int result = 0;

        for (int i=0; i<cnt; i++){
            for (int j=0; j<cnt; j++){
                boolean bool = true;
                for(int k=0; k<4; k++){
                    int nx = i+dx[k];
                    int ny = i+dy[k];
                    if(nx >=0 && nx<cnt && ny >=0 &&ny<cnt && arr[nx][ny]>=arr[i][j]){
                        bool = false;
                        break;
                    }
                }
                if(bool)result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        B10_Peak sol = new B10_Peak();
        Scanner in=new Scanner(System.in);
        int cnt = in.nextInt();
        int[][] arr = new int[cnt][cnt];

        for (int i=0; i<cnt; i++){
            for(int j=0; j<cnt; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.print(sol.max(cnt,arr));
    }

}
