import java.util.*;
import java.lang.*; 
import java.io.*;

class Main {

    static Node node;
    
    static class Node{
        int root;
        Node left;
        Node right;
        Node(int root){
            this.root = root;
        }

        public void insert(int n){
            if(this.root > n){
                if(this.left == null) this.left = new Node(n);
                else this.left.insert(n);
            }
            else{
                if(this.right == null) this.right = new Node(n);
                else this.right.insert(n);
            }
        }
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str ;
        while((str = br.readLine())!=null){
            int n = Integer.parseInt(str);
            if(node == null) node = new Node(n);
            else node.insert(n);
        }
        postorderTraversal(node);
    }

    public static void postorderTraversal(Node node){
        if(node == null) return;
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.println(node.root);
    }
    
}
