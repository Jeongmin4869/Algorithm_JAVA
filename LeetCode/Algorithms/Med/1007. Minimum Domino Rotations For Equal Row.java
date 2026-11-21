class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] nums = new int[7];
        int N = tops.length;
        for(int i=0; i<N; i++){
            nums[tops[i]] += 1;
            nums[bottoms[i]] += 1;
        }

        List<Integer> list = new ArrayList<>();
        for(int i=1; i<7; i++){
            if(nums[i]>=N) list.add(i);
        }

        int min = N;        
        for(int target : list ){
            int count = 0;
            for(int i=0; i<N; i++){
                if((tops[i]!=bottoms[i]) && (tops[i] !=target || bottoms[i] == target) ){
                    System.out.print(tops[i]);
                    System.out.println(" " + bottoms[i]);
                    count += 1;
                }
            }
            count = Math.min(count, N-count);
            min = Math.min(count, min);
        }

        return min; 
    }
}
