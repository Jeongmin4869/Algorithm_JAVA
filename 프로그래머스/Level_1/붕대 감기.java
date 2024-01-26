class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int hp = health;
        int time = 0, ftime = 0;
        for(int i=0; i<attacks.length; i++){
            time = attacks[i][0] - ftime-1; // 회복 시도한 시간 
            hp += time*bandage[1] +  time/bandage[0]*bandage[2]; // 회복한 체력
            if(hp > health) hp = health; // 얻을 수 있는 최대 체력
            hp -= attacks[i][1]; // 공격받은 후의 체력
            time = 0; // 붕대감기 연속시도 초기화
            ftime = attacks[i][0]; // 이전 공격받은 시간 저장
            if(hp <= 0) return -1; 
        }
        return hp;
    }
}
