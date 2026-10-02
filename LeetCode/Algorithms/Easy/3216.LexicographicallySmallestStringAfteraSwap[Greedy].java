class Solution {
    public String getSmallestString(String s) {
        for(int i=0; i<s.length()-1; i++){            
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            if(a%2 == b%2 && a>b){
                return s.substring(0, i) + b + a + s.substring(i+2);
            }
        }
        return s;
    }
}

/*
class Solution {
    public String getSmallestString(String s) {
        for(int i=0; i<s.length()-1; i++){
            String a = s.substring(i, i+1);
            String b = s.substring(i+1, i+2);
            
            if(check(a, b)){
                return s.substring(0, i) + b + a + s.substring(i+2);
            }
        }
        return s;

    }

    public static boolean check(String a, String b){
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        if(c%2 == d%2 && c>d) return true;
        return false;
    }
}

*/
