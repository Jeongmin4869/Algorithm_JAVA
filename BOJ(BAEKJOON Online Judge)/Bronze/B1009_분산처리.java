import java.util.*; 

class Main_B1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(getPcNum(a, b)).append("\n");
        }
        System.out.print(sb);
    }

    public static int getPcNum(int a, int b){
        int result = 1;
        for(int i=0; i<b; i++){
            result = result*a%10; 
        }
        // 오류의 원인
        if(result == 0) result = 10;
        return result;
    }
}
