import java.util.*;
import java.io.*;

class Main_B2635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> result = new ArrayList<>();
        for(int i=N; i>=0; i--){
            List<Integer> list = new ArrayList<>();
            
            list.add(N);
            list.add(i);
            
            while(true){
                int now = list.get(list.size()-2) - list.get(list.size()-1);
                if(now<0) break;
                list.add(now);
                
            }
            if(result.size()<list.size()){
                result = new ArrayList<>(list);
            }
        }
        
        System.out.println(result.size());
        for(int i=0; i<result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
        
    }
}
