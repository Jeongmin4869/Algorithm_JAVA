class Solution {
    public int[] solution(String[] wallpaper) {
        
        int lux = 50, luy = 50;
        int rdx = 0, rdy = 0;
        
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[0].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    lux = Math.min(lux, i);
                    rdx = Math.max(rdx, i);
                    luy = Math.min(luy, j);
                    rdy = Math.max(rdy, j);
                }
            }
        }
        
        return new int[]{lux, luy, rdx+1, rdy+1};
    }
}
