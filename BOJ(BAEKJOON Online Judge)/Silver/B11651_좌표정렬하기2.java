import java.util.*;

public class Main_B11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        
        for(int i=0; i<N; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();            
        }
        
        Arrays.sort(arr, (o1,o2)->{ 
            if(o1[1] == o2[1]) return o1[0] - o2[0];
            return o1[1] - o2[1];
        });
        
        for(int[] a : arr){
            sb.append(a[0]).append(" ").append(a[1]).append("\n");
        }
           
        System.out.println(sb);
        
        sc.close();
    }
    
}
