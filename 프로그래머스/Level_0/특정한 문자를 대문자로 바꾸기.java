class Solution {
    public String solution(String my_string, String alp) {
        /*
        StringBuilder sb = new StringBuilder();
        char ch;
        for(int i=0; i<my_string.length(); i++){
            ch = my_string.charAt(i);
            if(ch==alp.charAt(0))
                sb.append(alp.toUpperCase());
            else 
                sb.append(ch);
        }
        return sb.toString();
        */
        String a = alp.toUpperCase();
        return my_string.replaceAll(alp,a);
    }
}
