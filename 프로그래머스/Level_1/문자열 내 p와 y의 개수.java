class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        boolean answer = true;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'y') count++;
            if(s.charAt(i) == 'p') count--;
        }
        
        return count == 0 ? true : false;

    }
}
