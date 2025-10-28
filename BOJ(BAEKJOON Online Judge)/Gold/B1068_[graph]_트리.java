import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, count;
    static ArrayList<ArrayList<Integer>> g;
    static boolean[] check;
    static int root;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        count = 0;
        check = new boolean[N];
        g = new ArrayList<>();
        
        for(int i=0; i<N; i++){
            g.add(new ArrayList<>());
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt( br.readLine());
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num==-1) root = i;
            else g.get(num).add(i);
            
        }

        if(root == M) {
            System.out.print(0);
            return;
        }
        
        deleteNode(M);
        countleaf(root);

        
        System.out.println(count);
    }

    public static void deleteNode(int node){
        check[node] = true;
        for(int newnode : g.get(node)){
            if(!check[newnode]) deleteNode(newnode);
        }
    }

    public static void countleaf(int node){
        check[node] = true;

        int checkChild = 0;

        for(int newnode : g.get(node)){
            if(!check[newnode]) {
                checkChild += 1;
                countleaf(newnode);
            }
        }
        if(checkChild==0) count += 1;
    }
}
