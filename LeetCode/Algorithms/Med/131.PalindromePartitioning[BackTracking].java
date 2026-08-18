class Solution {
    static int N ;
    static List<List<String>> result;
    public List<List<String>> partition(String s) {
        N = s.length();
        result = new ArrayList<>();
        dfs(0, s, new ArrayList<>());
        return result;        
    }

    public static boolean check(String s){
        int N = s.length();
        for(int i=0; i<N/2; i++){
            if(s.charAt(i) != s.charAt(N-i-1)) return false;
        }
        return true;
    }

    public static void dfs(int start, String str, ArrayList<String> list ){
        if(start == N){
            result.add(new ArrayList<>(list));            
            return;
        }

        for(int end = start; end <N; end ++){
            String s = str.substring(start, end+1);
            if(check(s)){
                list.add(s);
                dfs(end+1, str, list);
                list.remove(list.size()-1);
            }
        }
        
    }
}
