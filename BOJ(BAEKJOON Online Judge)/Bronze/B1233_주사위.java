import java.util.*;

class Main_B1233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Map<Integer, Integer> m = new HashMap<>();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                for(int k=1; k<=c; k++){
                    int num = i + j + k;
                    m.put(num, m.getOrDefault(num, 0)+1);
                }
            }
        }

        List<Integer> keys = new ArrayList<>(m.keySet());
        Collections.sort(keys, (o1, o2) -> {
            if(m.get(o2) == m.get(o1)) return o1 - o2;
            return m.get(o2) - m.get(o1);
        });

        System.out.println(keys.get(0));
        sc.close();
    }
}
