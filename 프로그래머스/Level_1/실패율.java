class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] fail = new int[N];
        float[] fRate = new float[N];
        int player = stages.length;
        
        for(int i=0; i<stages.length; i++){
            if(stages[i] <= N){
                fail[stages[i]-1] += 1;
            }
        }
        
        for(int i=0; i<N; i++){
            if(player > 0){
                fRate[i] = fail[i]/(float)player;
                player -= fail[i];
            }
        }
        
        for(int i=0; i<N; i++){
            int maxIndex = 0;
            for(int j=0; j<N; j++){
                if(fRate[maxIndex] < fRate[j]) maxIndex = j;
            }
            answer[i] = maxIndex+1;
            fRate[maxIndex] = -1;
        }
        
        return answer;
    }
}
