class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (o1, o2)-> {
            return Integer.compare(o1[1], o2[1]);
        });

        int count = 0;
        int right = Integer.MIN_VALUE;
        for(int[] pair : pairs){
            if(pair[0] > right){
                count += 1;
                right = pair[1];
            }
        }

        return count ; 
    }
}
