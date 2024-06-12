import java.util.*;

public class Main_B9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<N; i++){
            sb.append(vps(sc.nextLine())?"YES":"NO").append("\n");
        }
        
        System.out.println(sb);
        sc.close();
    }

    
   public static boolean vps(String str){
       Stack<Character> s = new Stack<>();
       char[] arr = str.toCharArray();
       
       for(int i=0; i<arr.length; i++){
           if(arr[i] == '('){
               s.push('(');
           }
           else if (arr[i] == ')'){
               if(s.empty()) return false;
               s.pop();
           }      
       }
       if(s.size()>0) return false;
       return true;
    }
}
