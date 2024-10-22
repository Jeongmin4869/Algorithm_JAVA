import java.util.*;

class Main_B1440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] times = sc.nextLine().split(":");
        int result = 6;
        for(int i=0; i<3; i++){
            int time = Integer.parseInt(times[i]);
            if(time>59){
                result = 0;
                break;
            } 
            if(time<=0 || time>=13) result -= 2;
        }
        
        System.out.println(result);
    }
}
