import java.util.*;

public class Main_B2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();
        int N = sc.nextInt();
       
        for(int i=1; i<=N; i++){
            q.add(i);
        }
         
        int num;
        while(true){
            num=q.remove();
            if(q.isEmpty()) break;            
            q.add(q.remove());
        }
        
        System.out.println(num);
        sc.close();
    }

}
