class Solution {
    public boolean lemonadeChange(int[] bills) {        
        int[] count = new int[2];
        for(int i=0; i<bills.length; i++){
            int bill = bills[i];            
            int a = bill - 5;
            while(a > 0){
                if(a>=10 && count[1]>=1){
                    a -= 10;
                    count[1] -= 1;
                }
                else if(a>=5 && count[0]>=1){
                    a -= 5;
                    count[0] -= 1;
                }
                else{
                    return false;
                }
            }
            if(bill == 5) count[0] += 1;
            if(bill == 10) count[1] += 1;
        }
        return true;
    }
}
