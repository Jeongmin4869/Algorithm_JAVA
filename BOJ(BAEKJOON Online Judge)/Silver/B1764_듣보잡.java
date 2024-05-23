/* HashMap */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<num1; i++){
            map.put(sc.nextLine(), 1);
        }
        
        for(int i=0; i<num2; i++){
            String name = sc.nextLine();
            if(map.getOrDefault(name,0) == 1){
                list.add(name);
            }
        }
        
        Collections.sort(list);
        sb.append(list.size() + "\n");
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i)+ "\n");
        }
        
        System.out.println(sb);
        sc.close();
    }
    
}


/* HashSet */
import java.util.*;

public class Main_B1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<num1; i++){
            set.add(sc.nextLine());
        }
        
        for(int i=0; i<num2; i++){
            String name = sc.nextLine();
            if(set.contains(name)){
                list.add(name);
            }
        }
        
        Collections.sort(list);
        sb.append(list.size() + "\n");
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i)+ "\n");
        }
        
        System.out.println(sb);
        sc.close();
    }
    
}
