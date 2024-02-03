class Solution {
    public int solution(String my_string, String is_suffix) {
        //return my_string.lastIndexOf(is_suffix) == my_string.length()-is_suffix.length()?(my_string.lastIndexOf(is_suffix)!=-1?1:0):0;
        return my_string.endsWith(is_suffix)?1:0;
    }
}
