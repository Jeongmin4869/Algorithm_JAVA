import java.math.*;
class Solution {
    
    // int는 메모리 크기는 4byte로 표현할 수 있는 범위는 -2,147,483,648 ~ 2,147,483,647
    // long은 메모리 크기는 8byte로 표현할 수 있는 범위는 -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 
    // 무한의 정수가 들어갈 수 있는 가능성이 있다면 BigInteger이라는 클래스를 활용하는 것이 좋다. BigInteger은 문자열 형태로 이루어져 있어 숫자의 범위가 무한하기에 어떠한 숫자이든지 담을 수 있다.
    
    public String solution(String a, String b) {
        String answer = "";
        BigInteger one = new BigInteger(a);
        BigInteger two = new BigInteger(b);
        BigInteger sum = one.add(two);
        answer = sum.toString();
        return answer;
    }
}
