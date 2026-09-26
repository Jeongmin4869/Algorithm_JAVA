class Solution {
    static Boolean[] memo; // Boolean : 기본값 null / boolean : 기본값 false
    public boolean wordBreak(String s, List<String> wordDict) {        
        memo = new Boolean[s.length()];
        return dfs(0, s, wordDict);
    }

    // start부터 문자열 끝까지를 사전의 단어들로 만들 수 있는가
    public static boolean dfs(int start, String str, List<String> wordDict){

        // 끝까지 탐색 도달 
        if(start == str.length()){
            return true;
        }

        // start부터 문자열 끝까지를 사전의 단어들로 만들 수 있는가에대한 결과
        if(memo[start] != null){
            return memo[start];
        }

        for(int end = start + 1 ; end<=str.length(); end++ ){
            String word = str.substring(start, end);
            if(wordDict.contains(word)){
                if(dfs(end, str, wordDict)) return memo[start] = true;;
            }
        }
        return memo[start] = false;
    }
}
