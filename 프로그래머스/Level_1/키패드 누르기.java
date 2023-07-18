class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int lhand = 10;
        int rhand = 12;
        String h = (hand.equals("left"))?"L":"R";

        for(int i=0; i<numbers.length; i++){
            
            int num = numbers[i] == 0 ? 11 : numbers[i];
            
            if(num == 1 || num == 4 || num == 7){
                answer += "L";
                lhand = num;
                continue;
            }
            
            if(num == 3 || num == 6 || num == 9){
                answer += "R";
                rhand = num;
                continue;
            }

            int lDist = Math.abs((lhand-1)/ 3- (num-1)/3); // row
            int rDist = Math.abs((rhand-1)/3 - (num-1)/3); // row
            lDist += (lhand-num)%3==0?0:1; // cell
            rDist += (rhand-num)%3==0?0:1; // cell

            if(lDist < rDist){
                answer += "L";
                lhand = num;
            }
            else if(lDist > rDist){
                answer += "R";
                rhand = num;
            }
            else if(lDist == rDist) {
                answer += h;
                if(h == "L") lhand = num;
                else rhand = num;
            }
            
        }
        return answer;
    }
}
