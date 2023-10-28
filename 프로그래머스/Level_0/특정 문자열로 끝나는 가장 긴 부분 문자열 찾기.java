class Solution {
    public String solution(String myString, String pat) {
        
        int index = 0, size = pat.length();
        char last = pat.charAt(size-1);
        
        for(index=myString.length(); index>0 ;index--){
            if(myString.charAt(index-1)==last){
                if(myString.substring(index-size, index).equals(pat))
                    break;
            }
        }
        
        return myString.substring(0, index);
    }
}
