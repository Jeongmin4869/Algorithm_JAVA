class Solution {
    public String smallestSubsequence(String s) {
        TreeMap<Character, List<Integer>> tm = new TreeMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!tm.containsKey(c)){
                tm.put(c, new ArrayList<>());
            }
            List<Integer> list = tm.get(c);
            list.add(i);
            tm.put(c, list);
        }

        return "";
    }
}
