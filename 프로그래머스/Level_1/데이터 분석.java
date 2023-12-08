import java.util.*;
import java.util.List;
import java.util.stream.Collectors;


class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer;
        
        String[] columns = {"code", "date", "maximum", "remain"};
        
        int column1 = Arrays.asList(columns).indexOf(ext);
        int column2 = Arrays.asList(columns).indexOf(sort_by);
    
        answer = Arrays.stream(data)
                    .filter( i -> i[column1] < val_ext)
                    .toArray(int[][]::new);
        
        Arrays.sort(answer, (o1, o2) -> o1[column2] - o2[column2]);

        return answer;
    }
}
