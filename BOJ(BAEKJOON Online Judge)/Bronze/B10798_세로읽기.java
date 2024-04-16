import java.util.*;
public class Main_B10798 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];
        int maxN = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<5; i++){
            String str = sc.nextLine();
            arr[i] = str;
            if(maxN < str.length()) maxN = str.length();
        }

        for(int i=0; i<maxN; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j].length() > i){
                    sb.append(arr[j].charAt(i));
                }
            }
        }

        System.out.println(sb.toString());

        sc.close();
    }
}
