import java.io.*;
import java.util.StringTokenizer;
class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int N = Integer.parseInt(st.nextToken());
        	int M = Integer.parseInt(st.nextToken());
        	int[][] arr = new int[N][N];
        	
        	for(int i=0; i<N; i++) {
        		st = new StringTokenizer(br.readLine());
        		
        		for(int j=0; j<N; j++) {
        			arr[i][j] = Integer.parseInt(st.nextToken());
        		}
        	}
    
        	int max = 0;
        	for(int i=0; i<=N-M; i++) {
        		for(int j=0; j<=N-M; j++) {
        			int sum = 0;
        			
        			for(int k=0; k<M; k++) {
        				for(int l=0; l<M; l++) {
        					sum += arr[i+k][j+l];
        				}
        			}
        			
        			
        			max = Math.max(max, sum);
        			
        		}
        	}
        	
        	
        	
        	
        	
        	System.out.println("#"+(t+1)+" "+ max);
        	
        	
        	
        }
    }
}




