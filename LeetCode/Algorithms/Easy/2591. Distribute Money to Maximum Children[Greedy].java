class Solution {
    public int distMoney(int money, int children) {

        if(money < children) return -1;
        money -= children;

        int count = 0;
        count = Math.min(money/7, children);

        money -= count*7;
        children -= count;

        if(children == 1 && money == 3) return count-1;
        if(children == 0 && money > 0) return count -1;

        return count ;
    }
}
