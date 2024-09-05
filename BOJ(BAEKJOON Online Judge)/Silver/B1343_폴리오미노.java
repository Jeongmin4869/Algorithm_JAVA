import java.util.*;

class Main_B1343 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); ){
            if((i+3)<str.length()&&!str.substring( i, i+4).contains(".")){
                sb.append("AAAA");
                i+=4;
            }
            else if((i+1)<str.length()&&!str.substring(i,i+ 2).contains(".")){
                sb.append("BB");
                i+=2;
            }
            else if(str.charAt(i)!='X'){
                sb.append(".");
                i+=1;
            }
            else{
                System.out.print(-1);
                return;
            }
        }
        
        System.out.println(sb);
        sc.close();
    }
}
