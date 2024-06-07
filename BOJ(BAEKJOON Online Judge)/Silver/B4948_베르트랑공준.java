import java.util.*;

public class Main_B4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        int max = 0;
        int n = 0;
        while(true){
            n = sc.nextInt();
            if(n==0) break;
            list.add(n);
            max = Math.max(n, max);
        }
        
        boolean[] arr = new boolean[2*max+1];
        arr[0] = arr[1] = true;
        for(int i=2; i<=2*max; i++){
            if(!arr[i]){
                for(int j=2; j*i<=2*max; j++) arr[j*i] = true;
            }
        }
        
        for(int num : list){
            int count = 0;
            for(int j = num+1; j<=2*num; j++){
                if(!arr[j]) count +=1;
            }
            sb.append(count).append("\n");
        }
        
        System.out.print(sb);
        sc.close();
    }
}
