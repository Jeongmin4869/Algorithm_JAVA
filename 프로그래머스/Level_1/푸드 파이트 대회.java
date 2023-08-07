class Solution {
    public String solution(int[] food) {
        String left = "", right = "";
        
        for(int i=1; i<food.length; i++){
            int num = food[i];
            while(num>=2){
                right = Integer.toString(i) + right;
                left = left + Integer.toString(i);
                num -= 2;
            }
        }       
        return left + "0" + right;
    }
}
