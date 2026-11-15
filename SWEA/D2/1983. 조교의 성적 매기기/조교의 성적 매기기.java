import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=1; t<=T; t++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int N = Integer.parseInt(st.nextToken()); // 학생수
        	int k = Integer.parseInt(st.nextToken()); // 점수를 알고싶은 학생 번호
        	double[] p = new double[N];
    		double target = 0;
        	for(int i=0; i<N; i++) {
        		st = new StringTokenizer(br.readLine());
        		double j = Double.parseDouble(st.nextToken());
        		double l = Double.parseDouble(st.nextToken());
        		double g = Double.parseDouble(st.nextToken());
        		
        		p[i] = j * 0.35 + l * 0.45 + g * 0.2;
        		
            	if(i==k-1) {
            		target = p[i];
            	}
        	}
        	
        	Arrays.sort(p);
        	int rank = 0;
        	for(int i=0; i<N; i++) {
        		if(target == p[i]) {
        			rank = N-i;
        		}
        	}
        	int count = N/10;
        	String[] grade = {
        		    "A+", "A0", "A-", "B+", "B0",
        		    "B-", "C+", "C0", "C-", "D0"
        		};
        	int gradeIndex = 0;
        	for(int i = 0; i < 10; i++) {
        	    if(rank <= count * (i + 1)) {
        	        gradeIndex = i;
        	        break;
        	    }
        	}

            System.out.println("#" + t + " " + grade[gradeIndex]);
        	
        	
        }
        
        
        
        
        
        
    }
}




