class Solution {

    public List<Integer> partitionLabels(String s) {
        int[] idxs = new int[26];
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int now = c - 'a';
            idxs[now] = i;
        }       

        int preidx = 0;
        List<Integer> list = new ArrayList<>();
        int idx = idxs[s.charAt(0)-'a'];
        while(idx < s.length()){
            
            for(int i = preidx; i<=idx; i++){
                int now = idxs[s.charAt(i)-'a'];
                idx = Math.max(idx, now);
            }

            list.add(idx - preidx + 1);
            preidx = idx+1;
            idx += 1;

        }
        return list;
    }
}
