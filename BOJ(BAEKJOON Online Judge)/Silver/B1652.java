import java.util.*; 

class Main_B1652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[N];
        
        int row=0, col=0;
        for(int i=0; i<N; i++){
            arr[i] = sc.nextLine();
            int count = 0;
            for(int j=0;j<N;j++){
                if(arr[i].charAt(j) =='.'){
                    count += 1;
                }
                else{
                    if(count >= 2){
                        row += 1;
                    }
                    count = 0;
                }
            }
            if(count >= 2) row+=1;
            
        }

        for(int i=0; i<N; i++){
            int count = 0;
            for(int j=0;j<N;j++){
                if(arr[j].charAt(i)=='.'){
                    count += 1;
                }
                else{
                    if(count >= 2){
                        col += 1;
                    }
                    count = 0;
                }
            }
            if(count >= 2) col += 1;
        }
        System.out.print(row + " " + col);
        sc.close();
    }
}
