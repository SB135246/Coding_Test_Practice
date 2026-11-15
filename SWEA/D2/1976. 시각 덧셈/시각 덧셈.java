
import java.io.*;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int t=1; t<=T; t++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int s1 = Integer.parseInt(st.nextToken());
        	int b1 = Integer.parseInt(st.nextToken());
        	int s2 = Integer.parseInt(st.nextToken());
        	int b2 = Integer.parseInt(st.nextToken());
        	
        	int s = 0;
        	int b = 0;
        	
        	s = s1 + s2;
        	b = b1 + b2;
        	
        	if(b>=60) {
        		b = b%60;
        		s++;
        	}
        	if(s>12 && s<23) {
        		s = s%12;
        	}
        	if(s ==24)
        		s = 12;
        	
        	System.out.println("#" + t + " " + s + " " + b);
        	
        }
    }
}
