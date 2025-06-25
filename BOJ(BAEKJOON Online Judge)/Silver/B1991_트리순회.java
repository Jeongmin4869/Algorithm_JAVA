import java.util.*;
import java.io.*;

class Main_B1991 {

    static class Node {
        char root;
        Node left;
        Node right;
        Node(char root){
            this.root = root;
        }
    }

    static Node[] tree = new Node[26];
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<26; i++){
            tree[i] = new Node((char)('A' + i));
        }

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            if(left != '.'){
                tree[root-'A'].left = tree[left - 'A'];
            }
            if(right != '.'){
                tree[root-'A'].right = tree[right - 'A'];
            }
        }

        preorderTraversal(tree[0]);
        System.out.println();
        inorderraversal(tree[0]);
        System.out.println();
        postorderTraversal(tree[0]);
        
    }

    // 전위 순회 - 루트노드를 먼저 방문
    public static void preorderTraversal(Node node){
        if(node == null) return;
        System.out.print(node.root);
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    // 중위 순회 = 왼쪽자식을 갖지 않는 노드에 도달할 때까지 먼저 방문. 왼쪽 루트 오른쪽
    public static void inorderraversal(Node node){
        if(node == null) return;        
        inorderraversal(node.left);
        System.out.print(node.root);
        inorderraversal(node.right);
    }

    // 후위 순회 = 왼쪽서브트리 -> 오른쪽서브트리 -> 루트 
    public static void postorderTraversal(Node node){
        if(node == null) return;        
        postorderTraversal(node.left);        
        postorderTraversal(node.right);
        System.out.print(node.root);
    }
    
}
