class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int a=0, b=0;
        while(true){
            if(b==s.length || a==g.length) break;
            if(g[a]<=s[b]){
                count += 1;
                a+=1;
                b+=1;
            }
            else b+=1;
        }
        return count;
    }
}