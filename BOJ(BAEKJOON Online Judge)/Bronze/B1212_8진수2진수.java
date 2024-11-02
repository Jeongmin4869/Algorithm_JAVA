import java.util.*;

class Main_B1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oct = sc.nextLine();
        String[] binary = {"000", "001", "010", "011", "100", "101", "110", "111"};
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<oct.length(); i++){
            int num = oct.charAt(i)-'0';
            if(i==0){
                sb.append(String.valueOf(Integer.parseInt(binary[num])));    
            }
            else{
                sb.append(binary[num]);
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
