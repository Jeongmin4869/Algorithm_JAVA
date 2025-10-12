import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static class Node {
        int num;
        int count;

        Node(int num, int count){
            this.num = num;
            this.count = count;
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int result = bfs(A, B);
        System.out.print(result);
    }

    // BFS에서는 처음 도착하는 값이 최소값 
    /*
    public static int bfs(int A, int B){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(A, 1));
        
        while(!q.isEmpty()){
            Node node = q.poll();
            long num = node.num;
            int count = node.count;

            if(num == B){
                return count;
            }

            if(num*2 <= B)
                q.offer(new Node(num*2, count + 1));
            if(num*10+1 <= B)
                q.offer(new Node(num*10 + 1, count + 1));
            
        }
        return -1;
    }
    */

    public static int bfs(int A, int B){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(B, 1));
        
        while(!q.isEmpty()){
            Node node = q.poll();
            int num = node.num;
            int count = node.count;

            if(num == A){
                return count;
            }

            if(num%2 == 0 && num/2 >= A)
                q.offer(new Node(num/2, count + 1));
            if(num%10 == 1 && num/10 >= A)
                q.offer(new Node(num/10, count + 1));
            
        }
        return -1;
    }

}
