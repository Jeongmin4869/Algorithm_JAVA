/*
import java.util.ArrayList;

class Solution {

    public int[] solution(int l, int r) {
        int[] answer = {-1};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=l/5; i<=r/5; i++){
            if(i*5 > r) break;
            String str = Integer.toString(i*5);
            str = str.replaceAll("[50]", "");
            if(str.length() == 0){
                list.add(i*5);
            }
        }
        
        if(list.size() == 0) return answer;
        
        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}

*/

import java.util.ArrayList;

class Solution {

    public int[] solution(int l, int r) {
        int[] answer = {-1};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1; i<64; i++){
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if(num >= l && num <= r)
                list.add(num);
        }
        
        return list.size() == 0 ? answer : list.stream().mapToInt(i -> i).toArray();
    }
}
