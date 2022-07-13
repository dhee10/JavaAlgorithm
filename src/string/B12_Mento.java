package string;

import java.util.Scanner;

public class B12_Mento {
    public int sol(int student,int test, int[][] arr){
        int result =0;
        for(int i=1; i<=student; i++){ //학생 수 만큼 (학생번호 1번부터 시작) 학생 성적 비교하기 i = 학생
            for(int j =1; j<=student; j++){
                int count = 0;
                for(int k=0; k<test; k++) { //문제 수 만큼 , 각 시험에서  i가 j보다 높은 등수인지 확인하기
                    int person_i = 0, person_j = 0;
                    for (int n = 0; n < student; n++) { //등 수 만큼(학생수 만큼)
                        // 해당 위치에 본인 번호가 있으면 본인은 n등이다
                        // i 와 j가 멘토 멘티가 가능한지 비교를 한다 k 번째 테스트에서 몇 등인지 n을 돌면서 구한다.
                        if (arr[k][n] == i) person_i = n; // i의 등수
                        if (arr[k][n] == j) person_j = n; // j의 등수
//                        System.out.println("n = " + n); soutv

                    }
                    // 각 문제마다 j가 높으면 count를 올려주기
                    if (person_i < person_j) count++;
                }
                // 시험의 횟수와 같을 경우 모든 시험에서 i번 학생이 j번 학생보다 등수가 높다는 것을 의미
                // ex) 3번의 시험에서 3번다 시험 성적이 j가 높다면 count가 test랑 같은 수
                if(count == test) result++;
            }
        }


        return result;
    }
    // psvm 메인
    // iter for

    public static void main(String[] args) {
        B12_Mento T = new B12_Mento();
        Scanner in = new Scanner(System.in);
        int student = in.nextInt(); //학생수
        int test = in.nextInt(); //문제수
        int[][] arr = new int[test][student];

        for (int i = 0; i < test; i++) {
            for (int j = 0; j < student; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(T.sol(student, test, arr));
    }

}
