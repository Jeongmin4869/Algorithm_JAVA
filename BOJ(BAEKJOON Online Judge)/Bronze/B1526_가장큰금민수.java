import java.util.*;
class Main_B1526 {

    static ArrayList<Integer> list;
    static int n;
    
    public static void func(int num){
        if(num >n) return;
        list.add(num);
        func(num*10+4);
        func(num*10+7);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[] {4, 7};
        n = sc.nextInt();
        int result=0;
        list = new ArrayList<>();
        func(0);
        Collections.sort(list,Collections.reverseOrder());

        for(int i=0; i<list.size(); i++){
            if(list.get(i)<=n){
                result = list.get(i);
                break;
            }
        }
        
        System.out.print(result);
    }
}
