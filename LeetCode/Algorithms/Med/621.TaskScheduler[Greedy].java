class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> m = new HashMap<>();
        for(char task : tasks){
            m.put(task, m.getOrDefault(task, 0)+1);
        }
        
        int maxnum = 0;
        int maxcount = 0;
        for(int value : m.values()){
            if(maxnum<value){
                maxnum = value;
                maxcount = 1;
            }
            else if(value == maxnum){
                maxcount += 1;
            }
        }
        
        int answer1 = tasks.length; // maxcount > n
        int answer2 = (maxnum-1)*(n+1) + maxcount; //  maxcount <= n
        return Math.max(answer1, answer2);

    }
}
