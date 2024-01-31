import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[] giftLevel = new int[friends.length];
        int[][] counts =  new int[friends.length][friends.length];
        List<String> list = Arrays.asList(friends);
        for(int i=0; i<gifts.length; i++){
            String[] names = gifts[i].split(" ");
            int idx1 = list.indexOf(names[0]);
            int idx2 = list.indexOf(names[1]);
            counts[idx1][idx2] += 1;
            giftLevel[idx1] += 1;
            giftLevel[idx2] -= 1;
        }
        
        for(int i=0; i<friends.length; i++){
            int num = 0;
            for(int j=0; j<friends.length; j++){
                if((giftLevel[i] > giftLevel[j]&&counts[i][j] == counts[j][i]) 
                     || counts[i][j] > counts[j][i])
                    num += 1;
            }
            answer = answer<num?num:answer;
        }
        
        return answer;
    }
}
