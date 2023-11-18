
class Solution {
    public String solution(String my_string, int s, int e) {
        /*
        String answer ="";
        String[] arr = my_string.split("");
        
        while(s<=e){
            String temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        
        for(String a : arr){
            answer += a;
        }
        */
        
        StringBuilder substr = new StringBuilder(my_string.substring(s,e+1));
        substr.reverse();
        return my_string.substring(0, s) + substr + my_string.substring(e+1);
    }
}
