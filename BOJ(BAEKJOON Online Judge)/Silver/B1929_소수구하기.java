import java.util.*;

public class Main_B1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        StringBuilder sb = new StringBuilder();
        int min = sc.nextInt();
        int max = sc.nextInt();
        boolean[] arr = new boolean[max+1];
        
        for(int i=2 ; i<=max; i++){
            if(!arr[i]){
                for(int j=2 ; i*j<=max; j++){
                    arr[i*j] = true;
                }
            }
        }
        
        for(int i=min ; i<=max; i++){
            if(i<=1) continue;
            if(!arr[i]) sb.append(String.valueOf(i)).append("\n");
        }
        
        System.out.print(sb);
        sc.close();
    }  
}
