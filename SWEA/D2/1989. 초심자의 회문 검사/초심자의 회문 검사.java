import java.io.*;
import java.util.StringTokenizer;
class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=1; t<=T; t++) {
        	int result = 1;
        	String word = br.readLine();
        	for(int i = 0; i<(word.length()/2); i++) {
        		if(word.charAt(i) != word.charAt(word.length()-i-1)) {
        			result = 0;
        			break;
        		}
        	}
        	System.out.println("#" + t + " " + result );
        	
        	
        	
        	
        }
    }
}




