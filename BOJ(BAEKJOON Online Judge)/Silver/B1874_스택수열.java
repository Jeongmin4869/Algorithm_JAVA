import java.util.*;
import java.io.*;

class Main_B1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int cur = 1;
        for(int i=0; i<N; i++){
            int target = sc.nextInt();
            while(cur<=target){
                st.push(cur++);
                sb.append("+").append("\n");
            }
            if(st.peek() == target){
                st.pop();
                sb.append("-").append("\n");
            }
            else{
                System.out.print("NO");
                return;
            }
        }
        
        System.out.println(sb);
    }
}
