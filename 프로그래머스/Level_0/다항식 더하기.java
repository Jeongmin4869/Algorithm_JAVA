/*class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String num = "";
        int[] sums = {0,0};
        
        for(int i=0; i<polynomial.length(); i++){
            if(polynomial.charAt(i) == 'x'){
                if(num.equals("")) num = "1";
                sums[0] += Integer.parseInt(num);
                num = "";
                i+=3;
                continue;
            }
            
            if(polynomial.charAt(i) == ' '){
                sums[1] += Integer.parseInt(num);
                i+=2;
                num = "";
                continue;
            }
            num += polynomial.charAt(i);
        }
        
        if(num.length() > 0) sums[1] += Integer.parseInt(num);
        
        if(sums[0] == 1) answer += "x";
        else if (sums[0] > 1) answer += Integer.toString(sums[0]) + "x";
        
        if(sums[0] > 0 && sums[1] > 0) answer += " + ";
        
        if(sums[1] > 0) answer += Integer.toString(sums[1]);
        
        return answer  ;
    }
}
*/

class Solution {
    public String solution(String polynomial) {
        int xCount = 0;
        int sum = 0;
        
        for(String s : polynomial.split(" ")){
            if(s.contains("x")){
                xCount += s.equals("x") ? 1 : Integer.parseInt(s.replace("x", ""));
                continue;
            }
            if(!s.contains("+")){
                sum += Integer.parseInt(s);
            }
        }
        
        return (xCount != 0 ? (xCount == 1 ? "x" : xCount + "x") : "") + (sum != 0 ? (xCount!=0? " + " : "") + sum : xCount == 0 ? "0" : "");
        
    }
}
