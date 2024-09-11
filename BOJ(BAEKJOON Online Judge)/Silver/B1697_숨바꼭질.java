import java.util.*;
import java.io.*;

class Main_B1697 {
    static int N , M;
    static int[] check = new int[100001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        int answer = bfs(N);
        
        System.out.println(answer);
        br.close();
    }

    public static int bfs(int node){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            int index = q.poll();
            if(index == M) return check[index];
            if(index-1>=0 && check[index-1]==0){
                check[index-1]=check[index]+1;
                q.add(index-1);
            }
            if(index+1<=100000 && check[index+1]==0){
                check[index+1]=check[index]+1;
                q.add(index+1);
            }
            if(index*2<=100000 && check[index*2]==0){
                check[index*2]=check[index]+1;
                q.add(index*2);
            }
        }
        return -1;
    }
}
