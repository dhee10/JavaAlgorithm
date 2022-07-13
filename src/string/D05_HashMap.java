package string;
import java.util.HashMap;
import java.util.Scanner;

//최대 길이 연속부분수열
public class D05_HashMap {
    public char sol(int cnt, String str){
        char result =' ';
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x: str.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);

        }
        return result;
    }


    public static void main(String[] args) {
        D05_HashMap T = new D05_HashMap();
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        String str=in.next();

        System.out.println(T.sol(cnt,str));


    }
}
