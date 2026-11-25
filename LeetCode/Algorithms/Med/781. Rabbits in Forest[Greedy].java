class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<answers.length; i++){
            int num = answers[i];
            m.put(num, m.getOrDefault(num, 0) + 1);
        }

// 같은 숫자로 대답한 토끼들을 최대한 같은 색깔 그룹에 묶되, 그룹 크기를 초과하면 새로운 그룹을 만드는
        int answer = 0;
        for(int key : m.keySet()){
            int value = m.get(key);
            int groupsize = key+1;
            int groupcount = value/groupsize;
            if(value%groupsize > 0) groupcount += 1; 
            answer += groupsize * groupcount;            
        }

        return answer;
    }
}
