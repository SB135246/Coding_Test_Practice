
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        for(int t=1; t<=T; t++) {
        	int N = sc.nextInt();
        	int M = sc.nextInt();
        	int[] arrN = new int[N];
        	int[] arrM = new int[M];
        	
        	for(int i=0; i<N; i++) {
        		arrN[i] = sc.nextInt();
        	}
        	for(int i=0; i<M; i++) {
        		arrM[i] = sc.nextInt();
        	}
        	
        	int max = 0;
        	
        	if(N>=M) {
        		for(int i=0; i<=N-M; i++) {
        	     	int sum = 0;
        			for(int j=i; j<M+i; j++) {
        				sum += arrN[j] * arrM[j-i];
        			
        			}
        			max = Math.max(sum,max);
        		}
        	}
        	
        	if(N<M) {
        		for(int i=0; i<=M-N; i++) {
        	     	int sum = 0;
        			for(int j=i; j<N+i; j++) {
        				sum += arrM[j] * arrN[j-i];
        			}
        			max = Math.max(sum,max);
        		}
        	}
        	
        	
        	
        	
        	
        	System.out.println("#" + t + " " + max);
        }
    }
}

