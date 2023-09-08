class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for(int i=0; i<dic.length; i++){
            String str = dic[i];
            int j = 0;
            for(j=0; j<spell.length; j++){
                if(!str.contains(spell[j])){
                    break;
                }
            }
            if(j == spell.length) {
                return 1;
            }
        }
        return 2;
    }
}
