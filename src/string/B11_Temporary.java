package string;

import java.util.Scanner;

public class B11_Temporary {
    public int solution (int test,int student, int[][] arr){
        int result=0;
        for (int i = 1; i <= test; i++) { //멘토
            for (int j = 1; j <= test; j++) { //멘티
                if (i == j) continue;

                int count = 0;
                int mentor = 0; int mentee = 0; //멘토 멘티의 등수

                for (int k = 0; k < student; k++) { //k번째 시험
                    for (int s = 0; s < test; s++) { //등수
                        if (arr[k][s] == i) mentor = s;
                        if (arr[k][s] == j) mentee = s;
                    }
                    if (mentor < mentee){ //멘토가 등수가 더 높으면
                        count++;
                    }
                }
                if (count == student) { //멘토가 모든 시험에서 앞서면
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        B11_Temporary sol = new B11_Temporary();
        Scanner in=new Scanner(System.in);
        int test= in.nextInt(); //학생수
        int student =in.nextInt(); //문제수
        int[][] arr = new int[test][student];

        for(int i=0; i<test; i++){
            for(int j=0; j<student; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.print(sol.solution(test,student,arr));
    }

}
