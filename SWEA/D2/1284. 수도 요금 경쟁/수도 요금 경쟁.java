import java.io.*;
import java.util.StringTokenizer;
class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int P = Integer.parseInt(st.nextToken()); //A사 1리터당 P원
        	int Q = Integer.parseInt(st.nextToken()); //B사 기본요금 원
        	int R = Integer.parseInt(st.nextToken()); //B사 원간 사용량 R 이하 L
        	int S = Integer.parseInt(st.nextToken()); //R리토보다 많으면 리터당 S 원
        	int W = Integer.parseInt(st.nextToken()); //사용량 L
        	
        	int result = 0;
        	
  
        	if(W<=R && (W*P) > Q) {
        		result = Q;
        	}
        	else if(W>R && (W*P)> (Q + (W-R)*S)) {
        		result = Q + (W-R)*S;
        	}
        	else {
        		result = W*P;
        	}
        
        	System.out.println("#" + (i+1) + " " + result);
        	
        	
        	
        	
        	
        }
        
        
        
        
    }
}




//A사 : 1리터당 p원
//B사 : 기본요금 Q, 월간 사용량 R리터 이하면 기본요금, R보다 많으면 초과량 1리터당 S원 더내야됨.
//종민이 집에서 한달 수도양 W리터
