import java.util.*;

public class Main_B1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        String[] arr = new String[N1];
        sc.nextLine();
        for(int i=1; i<=N1; i++){
            String name = sc.nextLine();
            map.put(name, i);
            arr[i-1] = name;
        }
       
        for(int i=0; i<N2; i++){
            String str = sc.nextLine();
            if(Character.isDigit(str.charAt(0)))
               sb.append(arr[Integer.parseInt(str)-1]);
            else
               sb.append(map.get(str)); 
            sb.append("\n");
        }
        System.out.println(sb);

        sc.close();
    }    
}
