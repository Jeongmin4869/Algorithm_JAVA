class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int N = tops.length;
        int result = N;

        int[] targets = new int[]{tops[0], bottoms[0]};

        for(int target : targets){
            int topcount = 0;
            int bottomcount = 0;
            boolean found = true;

            for(int i=0; i<N; i++){
                if(tops[i] != target && bottoms[i] != target){
                    found = false;
                    break;
                }

                if(tops[i] != target) topcount += 1;
                if(bottoms[i] != target) bottomcount += 1;
            }

            if(found) result = Math.min(result, Math.min(topcount , bottomcount));

        }

        return result==N?-1:result; 
    }
}
