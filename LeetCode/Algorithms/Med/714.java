class Solution {
    public int maxProfit(int[] prices, int fee) {
        int total = 0;
        boolean buyed = false;
        int N = prices.length;

        for(int i=0; i<N; i++){
            int price = prices[i];
            if(!buyed && i+1<N && prices[i] < prices[i+1]){
                buyed = true;
                total -= price;
            }
            else if (buyed && i+1<N && prices[i] < prices[i+1]){
                buyed = false;
                total += price - fee;
            }

        }
        return total;
    }
}
