class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char key = s.charAt(i);
            map.put(key, map.getOrDefault(key, 0)+1);
        }

        boolean flag = false;
        int count = 0;
        for(int num : map.values()){
            if(num%2==0) count += num;
            else {
                flag = true;
                count += num-1;
            }
        }

        return !flag?count:count+1;
        
    }
}