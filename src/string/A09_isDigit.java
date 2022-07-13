package string;

import java.util.Scanner;

public class A09_isDigit {
    //숫자만 추출 - 1 정규식으로 >> 이 때는 앞에가 00이면 0 한개만 삭제 되기때문에 실패
    public String Test1(String str){
        String result="";

        result = str.replaceAll("[^0-9]","");
        if(result.charAt(0) != '0'){
            return result;
        }else{
            result = result.replaceFirst("0","");
        }
        return result;
    }
    // 2. for문 + 아스키 코드
    public int Test2(String str){
        int result =0;

        for (char c: str.toCharArray()) {
            if(c >=48 && c <=57){
                result = result*10+(c-48); // 여기에서 c는 아스키로 되어서 0이면 48-48
            }
        }

        return result;
    }
//    3. Character.isDigit 사용
    public int Test3(String str){
        String result = "";

        for (char c: str.toCharArray()) {
            if(Character.isDigit(c)) result += c;
        }

        return Integer.parseInt(result);
    }
    public static void main(String[] args) {
        A09_isDigit A = new A09_isDigit();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();

        System.out.println("test1 >"+A.Test1(str));
        System.out.println("test2 >"+A.Test2(str));
        System.out.println("test3 >"+A.Test3(str));

    }

}
