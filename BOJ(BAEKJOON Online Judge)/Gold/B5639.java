import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    static Node node;
    
    static class Node{
        int root;
        Node left;
        Node right;
        Node(int root){
            this.root = root;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str ;
        while((str = br.readLine())!=null){
            int n = Integer.parseInt(str);
            if(node == null) node = new Node(n);
            else insert(node, n);
        }
        System.out.println("Hello world!");
    }
    public static void insert(Node node, int n){
        int root = node.root;
        if(root > n){
            node.left = new Node(n);
        }
        else{
            node.right = new Node(n);
        }
    }
}
