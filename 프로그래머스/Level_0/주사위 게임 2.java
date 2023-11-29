import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int a, int b, int c) {
        /*
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        set.add(a); set.add(b); set.add(c);
        
        answer += a + b + c;
        if(set.size() <= 2)
            answer *= (a*a + b*b + c*c);
        if(set.size() <= 1)
            answer *= (a*a*a + b*b*b + c*c*c);
        
        return answer;
        */
        
        int count = 1;
        int answer = 1;
        
        if(a==b || a==c || b==c){
            count += 1;
        }
        
        if(a==b && b==c){
            count += 1;
        }
        
        for(int i=1; i<=count; i++){
            answer *= (pow(a, i) + pow(b, i) + pow(c, i));
        }
        
        return answer;
    }
    
    public int pow(int num, int count){
        if(count == 0) return 1;
        return num * pow(num, count -1);
    }
    
}
