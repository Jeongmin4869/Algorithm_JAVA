import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[][] counts = new int[1001][2];
        int maxn = 0;
        
        for(int i=0; i<array.length; i++){
            counts[array[i]][0] = array[i];
            counts[array[i]][1] += 1;
        }

        Arrays.sort(counts, (o1, o2) -> {
            return o2[1]!=o1[1] ? o2[1]-o1[1] : o2[0]-o1[0]; // 두번째값기준 내림차순, 첫번째값기준 내림차순
            // return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1]; // 첫번째 기준 오름차순
        });

        if(counts[0][1] == counts[1][1]) return -1;
        
        return counts[0][0];
    }
}
