class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;
        
        int count = 0;
        for(int i=0; i<size; i++){
            if(flowerbed[i] == 0){
                int left = (i-1<0) ? 0 : flowerbed[i-1];
                int right = (i+1>=size) ? 0 : flowerbed[i+1];
                if(left == 0 && right == 0){
                    count += 1;
                    flowerbed[i] = 1;
                }
            }
        }
        if(count>=n)return true;
        else return false;
    }
}
