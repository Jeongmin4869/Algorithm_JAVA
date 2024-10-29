import java.util.*;

class Main_B1855 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] arr = new String[str.length()/n];

        for(int i=0; i<arr.length; i++){
            StringBuilder s = new StringBuilder(str.substring(i*n, i*n+n));
            arr[i] = s.toString();
            if(i%2==1) arr[i] = s.reverse().toString();
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            for(int j=0; j<arr.length; j++){
                sb.append(arr[j].charAt(i));
            }
        }  
        System.out.println(sb);
        sc.close();
    }
}
