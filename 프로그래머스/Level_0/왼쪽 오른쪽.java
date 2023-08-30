class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        String std="";
        int index = 0;
        for(index = 0; index<str_list.length; index++){
            if(str_list[index].equals("l") || str_list[index].equals("r")){
                std = str_list[index];
                break;
            }
        }
        
        if(std.equals("l")){
            answer = new String[index];
            for(int i=0; i<index; i++){
                answer[i] = str_list[i];
            }
        }
        else if(std.equals("r")){
            int size = str_list.length - index-1;
            answer = new String[size];
            for(int i=0; i<size; i++){
                answer[i] = str_list[index+1+i];
            }
        }
        
        return answer;
    }
}
