class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++){
            int n = 0;
            for(int j=0; j<words.length;j++){
                if(n + words[j].length() > babbling[i].length())
                    continue;
                if(babbling[i].substring(n, n+words[j].length()).equals(words[j])){
                    n += words[j].length();
                    j = -1;
                }
            }
            if(n == babbling[i].length()) answer += 1;     
        }
        
        return answer;
    }
}
