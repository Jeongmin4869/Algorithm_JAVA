class Solution {
    public boolean validPalindrome(String s) {

        if(check(s)) return true;

        int l = 0;
        int r = s.length()-1;
        while(l<=r){
            if(s.charAt(l) != s.charAt(r)){
                String left = s.substring(0,l) + s.substring(l+1, s.length());
                String right = s.substring(0,r) + s.substring(r+1, s.length());
                return (check(left) || check(right));
            }
            l += 1;
            r -= 1;
        }

        return true;
    }

    public static boolean check(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)) return false;
        }
        return true;
    }
}
