class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        int N = hand.length;
        if(N%groupSize != 0) return false;

        for(int i=0; i<N; i++){
            int num = hand[i];
            tm.put(num, tm.getOrDefault(num, 0)+1);
        }

        while(!tm.isEmpty()){
            int first = tm.firstKey();
            tm.put(first,tm.get(first)-1);
            if(tm.get(first)==0) tm.remove(first);          
            
            for(int i=1; i<=groupSize-1; i++){
                int next = first+i;
                
                if(!tm.containsKey(next)) return false;
                
                if(tm.get(next)==1) tm.remove(next);
                else tm.put(next,tm.get(next)-1);
            }
        }

        return true;
    }
}
