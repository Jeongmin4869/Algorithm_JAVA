class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> m = new HashMap<>();
        for(char task : tasks){
            m.put(task, m.getOrDefault(task, 0)+1);
        }
        
        int maxnum = 0;
        for(int value : m.values()){
            maxnum = Math.max(value, maxnum);
        }
        
        if(n <= m.size()) return maxnum*n;
        else return maxnum*m.size();

    }
}
