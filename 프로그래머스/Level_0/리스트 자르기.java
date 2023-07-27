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
