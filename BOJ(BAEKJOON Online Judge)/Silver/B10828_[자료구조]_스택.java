import java.util.*;
import java.io.*;

class Main {
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String act = st.nextToken();

            switch (act) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    s.push(num);
                    break;
                // in JAVA Top -> Peek
                case "top":
                    if(s.size() == 0)
                        System.out.println(-1);
                    else 
                        System.out.println(s.peek());
                    break;
                case "size":
                    System.out.println(s.size());
                    break;
                case "empty":
                    System.out.println(s.empty()?1:0);
                    break;
                case "pop":
                    if(s.size() == 0)
                        System.out.println(-1);
                    else 
                        System.out.println(s.pop());
                    break;
            }
        }    
        
    }

}
