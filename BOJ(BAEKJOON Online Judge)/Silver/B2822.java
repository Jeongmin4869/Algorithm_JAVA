import java.util.*;
import java.lang.*;
import java.io.*;

class Main_B2822{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<int[]> scores = new ArrayList<>();
        for(int i=1; i<=8; i++){
            int[] now = new int[2];
            now[0] = Integer.parseInt(br.readLine());
            now[1] = i;
            scores.add(now);
        }

        Collections.sort(scores, (o1,o2)->{
            return o2[0] - o1[0];
        });

        int sum = 0;
        int[] questions = new int[5];
        for(int i=4; i>=0; i--){
            int[] score = scores.get(i);
            sum += score[0];
            questions[i] = score[1];
        }

        System.out.println(sum);
        
        Arrays.sort(questions);
        for(int i=0; i<5; i++){
            System.out.print(questions[i] + " ");
        }
        
    }
}
