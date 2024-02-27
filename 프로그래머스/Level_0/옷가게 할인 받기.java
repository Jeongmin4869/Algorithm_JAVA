class Solution {
    public int solution(int price) {
        
        double per = 1.0;
        
        if(price >= 500000){
            per = 0.8;
        }
        else if(price >= 300000){
            per = 0.9;
        }
        else if(price >= 100000){
            per = 0.95;
        }
        
        return (int)(price*per);
    }
}
