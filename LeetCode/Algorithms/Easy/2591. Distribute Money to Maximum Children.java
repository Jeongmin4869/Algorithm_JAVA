class Solution {
    public int distMoney(int money, int children) {

        if(money < children) return -1;
        money -= children;

        int count = 0;
        count = money/7;

        money -= count*7;
        children -= count;

        if(children == 1 && money == 3) return 1;

        return count ;
    }
}
