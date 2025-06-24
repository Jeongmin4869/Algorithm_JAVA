import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    public static class Node{
        char root;
        Node left;
        Node right;
        Node(char root){
            this.root = root;
        }
    }

    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Node[] node = new Node[26];
        for(int i=0; i<26; i++){
            node[i] = new Node((char)('A'+i));
        }

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            if(left != '.'){
                node[root - 'A'].left = node[left - 'A'];
            }
            if(right != '.'){
                node[root - 'A'].right = node[right - 'A'];
            }
        }

        
        System.out.println("Hello world!");
    }
}
