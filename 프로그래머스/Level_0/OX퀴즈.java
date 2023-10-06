class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            String[] q = quiz[i].split(" ");
            int sum = 0;
            for(int j=0; j<q.length; j++){
                if(q[j].equals("-")){
                    sum += -1 * Integer.parseInt(q[++j]);
                    continue;
                }
                
                if(q[j].equals("+")){
                    sum += Integer.parseInt(q[++j]);
                    continue;
                }
                
                if(q[j].equals("=")){
                    
                    if(q[j+1].equals("-")){
                        sum *= -1;
                        j+=1;
                    }
                    
                    //System.out.println(sum + " == " +  Integer.parseInt(q[j+1]));
                    
                    if(sum == Integer.parseInt(q[++j]))
                        answer[i] = "O";
                    else 
                        answer[i] = "X";
                }
                
                sum += Integer.parseInt(q[j]);
                
            }
        }
        
        return answer;
    }
}
