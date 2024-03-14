class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0,0};
        int N = park.length;
        int M = park[0].length();
        for(int y=0; y<N; y++){
            for(int x=0; x<M; x++){
                if(park[y].charAt(x) == 'S') {
                    answer[0] = y;
                    answer[1] = x;
                    System.out.println(answer[0] + " , " + answer[1]);
                    break;
                }
            }
        }
        
        for(int i=0; i<routes.length; i++){
            int nowy = answer[0];
            int nowx = answer[1];
            
            String[] route = routes[i].split(" ");
            int go = Integer.parseInt(route[1]);
            switch(route[0]){
                case "N":
                    nowy -= go;
                    break;
                case "S":
                    nowy += go;
                    break;
                case "W":
                    nowx -= go;
                    break;
                case "E":
                    nowx += go;
                    break;
                default:
                    break;
            }
            if( nowx>=0 && nowx<M && nowy>=0 && nowy<N){
                
                boolean flag = true;
                
                for(int y=Math.min(nowy, answer[0]); y<=Math.max(nowy, answer[0]); y++){
                    if(park[y].charAt(answer[1]) == 'X'){
                        flag = false;
                        break;
                    }
                }
                
                for(int x=Math.min(nowx, answer[1]); x<=Math.max(nowx, answer[1]); x++){
                    if(park[answer[0]].charAt(x) == 'X'){
                        flag = false;
                        break;
                    }
                }
                
                if(flag){
                    answer[0] = nowy;
                    answer[1] = nowx;
                    //System.out.println(i + " : " + answer[0] + " , " + answer[1]);
                }
            }
        }
        
        return answer;
    }
}
