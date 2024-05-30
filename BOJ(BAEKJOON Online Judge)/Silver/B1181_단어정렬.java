import java.util.*;

public class Main_B1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        sc.nextLine();
        Set<String> set = new HashSet<>();
        
        for(int i=0; i<N; i++){
            set.add(sc.nextLine());
        }
        
        String arr[] = set.toArray(new String[set.size()]);
        
        Arrays.sort(arr, (o1, o2)-> {
            if(o1.length()==o2.length()) return o1.compareTo(o2);
            return o1.length()-o2.length();
        });
        
        for(String str : arr){
            sb.append(str).append("\n");
        }
            
        System.out.println(sb);
        
        sc.close();
    }
    
}
