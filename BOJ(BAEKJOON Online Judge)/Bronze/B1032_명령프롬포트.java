import java.util.*;

class Main_B1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        String[] arr = new String[N];
        sc.nextLine();
        for(int i=0; i<N; i++){
            arr[i] = sc.nextLine();
        }

        String str = arr[0];
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            for(int j=1; j<N; j++){
                if(arr[j].charAt(i) != c){
                    c = '?';
                    break;
                }
            }
            sb.append(c);
        }

        System.out.print(sb);
        sc.close();
    }

}
