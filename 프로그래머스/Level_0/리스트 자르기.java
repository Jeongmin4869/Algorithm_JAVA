/*
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        switch(n){
            case 1:
                answer = Arrays.copyOfRange(num_list, 0, slicer[1]+1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
                break;
            case 4:
                int size = (slicer[1] + 1 - slicer[0] ) / slicer[2];
                if((slicer[1] + 1 - slicer[0])%slicer[2] != 0) size += 1;
                answer = new int[size];
                int index = 0;
                for(int i=slicer[0]; i<=slicer[1]; i+=slicer[2]){
                    answer[index++] = num_list[i];
                }
                break;
        }
        return answer;
    }
}
*/

import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = 0, end = num_list.length-1, step=1;
        
        switch(n){
            case 1:
                end = slicer[1];
                break;
            case 2:
                start = slicer[0];
                break;
            case 3:
                start = slicer[0];
                end = slicer[1];
                break;
            case 4:
                start = slicer[0];
                end = slicer[1];
                step = slicer[2];
                break;
        }
        
        int[] answer = new int[(end - start + step) / step];
        int index = 0;
        for(int i=start; i<=end; i+=step){
            answer[index++] = num_list[i];
        }
        
        return answer;
    }
}
