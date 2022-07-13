package string;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//큐의 자료구조.
//먼저들어간게 먼저나오는 구조
public class E09_Queue4_Emergency {
    class Person{
        int id; // 몇 번째 사람인지
        int num; // 위험도

        public Person(int id, int num) {
            this.id = id;
            this.num = num;
        }
    }
    public int sol(int total, int m, int[] danger){
        int result = 0;
        Queue<Person> q = new LinkedList<>();

        //큐에 사람 정보 넣기
        for (int i = 0; i < total; i++) {
            q.add(new Person(i, danger[i]));
        }

        //큐가 완전히 빌 때 까지
        while (!q.isEmpty()){
            // 한 사람 객체 꺼내서 넣기
            Person person = q.poll();

            for (Person x : q) {
                if (x.num > person.num) {
//                    person 객체에 있는 사람이 해당 번째 사람보다 위험도가 작으면
//                    꺼내서 다시 뒤로 넣고, person객체 초기화 후 break
                    q.offer(person);
                    person = null;
                    break;
                }
            }
            // person이 null이 아닐 경우 가장 위험도가 높은사람 = 진료가능
            if (person != null) {
                result ++; // 진료본 수 올려주기
                // 해당 환자가 찾으려는 숫자이면 쌓인 result 값리턴
                if (person.id == m) return result;
            }
        }
       return result;
    }


    public static void main(String[] args) {
        E09_Queue4_Emergency T = new E09_Queue4_Emergency();
        Scanner in = new Scanner(System.in);
        int total = in.nextInt(); //총 환자 수
        int m= in.nextInt(); //몇 번째 환자 찾아야하는지
        int[] danger = new int[total]; // 위험한 순위(우선순위)

        for (int i = 0; i < total; i++) {
            danger[i] = in.nextInt();
        }


        System.out.println(T.sol(total,m,danger));
    }
}
